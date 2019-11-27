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
 * @author Utente
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{

	/**
	 * @param typecode
	 */

	public DefaultPassengerDao()
	{
		super(PassengerModel._TYPECODE);
	}



	@Override
	public List<PassengerModel> findPassengertbynamesurname(final String name, final String surname)
	{

		final String queryStr = "SELECT{PK} FROM{Car} WHERE {name} = ?name AND {surname} = ?surname ";
		final FlexibleSearchQuery fsq= new FlexibleSearchQuery(queryStr );
		fsq.addQueryParameter("name", name);
		fsq.addQueryParameter("surname", surname);
		final SearchResult<PassengerModel> result = (SearchResult<PassengerModel>) getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passenger = result.getResult();
		return passenger;
	}

}
