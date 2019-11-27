/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;

/**
 * @author Simona Branca
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{

	/**
	 * @param typecode
	 */
	public DefaultPassengerDao(final String typecode)
	{
		super(typecode);

	}

	@Override
	public List<PassengerModel> findAirportByNameSurname(final String name, final String surname)
	{
		final String queryStr = "SELECT{PK} FROM{Passenger} WHERE {name} =? name AND {surname} =? surname";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("name", name);
		fsq.addQueryParameter("surname", surname);
		//		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		//		final List<PassengerModel> passengers = result.getResult();
		//		return passengers;
		return getFlexibleSearchService().<PassengerModel> search(fsq).getResult();
	}





}
