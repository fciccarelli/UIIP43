
/**
 *
 */
package it.uiip.airport.core.dao.impl;


import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

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
	public List<PassengerModel> findPassengerByNameSurname(final String name, final String surname)
	{
		final String queryStr = "SELECT {PK} FROM {Passenger} WHERE {name}=?name AND {surname}=?surname";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("name", name);
		fsq.addQueryParameter("surname", surname);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengers = result.getResult();

		return passengers;
	}

	@Override
	public List<PassengerModel> findPassengersByFlight(final String code)
	{
		final String queryStr = " SELECT {p.name}, {p.surname}, {t.numberSeat}, {t.code} FROM {Flight as f "
				+ "	JOIN Ticket as t 	" + "	ON {t.flight} = {f.PK} "

				+ "	JOIN Passenger as p " + "	ON {t.passenger} = {p.PK} "

				+ "}  WHERE {f.code} = ?code";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengersModel = result.getResult();
		return passengersModel;

	}




}
