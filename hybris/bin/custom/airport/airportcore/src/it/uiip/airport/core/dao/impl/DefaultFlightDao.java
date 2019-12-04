/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.TicketModel;

/**
 * @author pasop
 *
 */
public class DefaultFlightDao extends DefaultGenericDao<FlightModel> implements FlightDao
{

	public DefaultFlightDao()
	{
		super(FlightModel._TYPECODE);
	}

	@Override
	public List<FlightModel> findAllFlights()
	{
		final String query = "SELECT {PK} FROM {Flight}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);

		final SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		final List<FlightModel> flightModels = result.getResult();
		return flightModels;

	}

	@Override
	public FlightModel findFlightByTicket(String ticketCode){

		final String query = "SELECT {f.PK} FROM {Flight as f\n" +
				"\t\n" +
				"    JOIN Ticket as t\n" +
				"    ON {f.PK} = {t.flight}\n" +
				"\n" +
				"} WHERE {t.code} = ?ticketCode";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);

		final SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		final List<FlightModel> flightModels = result.getResult();
		return flightModels.get(0);

	}

	@Override
	public List<TicketModel> findTicketByFlight(String code) {
		String query = "SELECT {t.PK} FROM {Flight as f " +
				" JOIN Ticket as t " +
				" ON {f.PK} = {t.flight} " +
				"} WHERE {f.code}=?code ";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("code", code);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> ticketsList = result.getResult();
		return ticketsList;
	}

	@Override
	public FlightModel findFlightByCode(String code) {
		final String query = "SELECT {PK} FROM {Flight} WHERE {code} = ?code ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("code",code);
		final SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		final List<FlightModel> flightModels = result.getResult();
		return flightModels.get(0);
	}

}
