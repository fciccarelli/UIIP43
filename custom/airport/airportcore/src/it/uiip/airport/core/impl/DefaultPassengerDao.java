/**
 *
 */
package it.uiip.airport.core.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;


/**
 * @author sdeli
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{


	public DefaultPassengerDao()
	{
		super(PassengerModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}


	@Override
	public List<PassengerModel> findPassengerbynamesurname(final String name, final String surname)
	{

		final String queryStr = "SELECT {PK} FROM {Passenger} WHERE {name}=?name AND {surname}=?surname";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("name", name);
		fsq.addQueryParameter("surname", surname);
		final SearchResult<PassengerModel> result = (SearchResult<PassengerModel>) getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengers = result.getResult();

		return passengers;

	}



}
