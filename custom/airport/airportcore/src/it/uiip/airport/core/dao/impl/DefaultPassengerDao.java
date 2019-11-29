/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import javax.naming.directory.SearchResult;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.jalo.Passenger;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.model.PassengerModel;


/**
 * @author ASUS
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{
	public DefaultPassengerDao()
	{

		super(AirportModel._TYPECODE);
	}

	/**
	 * @param typecode
	 */
	public DefaultPassengerDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public PassengerModel findByNameSurname(final Passenger nome, final Passenger cognome)
	{

		final String queryStr = "SELECT {PK} FROM {Passenger} WHERE ({nome}=?nome and {cognome}=?cognome)";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult result = (SearchResult) getFlexibleSearchService().search(fsq);
		final PassengerModel passenger = (PassengerModel) ((de.hybris.platform.servicelayer.search.SearchResult<Object>) result)
				.getResult();
		return passenger;
	}

}
