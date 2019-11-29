/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;


/**
 * @author pasop
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao implements PassengerDao
{

	/**
	 * @param typecode
	 */
	public DefaultPassengerDao()
	{
		super(PassengerModel._TYPECODE);
	}

	@Override
	public List<PassengerModel> findPassengersByNameAndSurname(final String name, final String surname)
	{
		final String query = "SELECT {" + PassengerModel.UID + "} FROM {" + PassengerModel._TYPECODE + "} " + "WHERE {"
				+ PassengerModel.NAME + "} =?name AND {" + PassengerModel.SURNAME + "} = ?surname";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("name", name);
		fsq.addQueryParameter("surname", surname);

		final SearchResult<PassengerModel> result = (SearchResult<PassengerModel>) getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengers = result.getResult();

		return passengers;
	}

}
