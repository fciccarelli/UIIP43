/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.TicketsDao;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public class DefaultTicketsDao extends DefaultGenericDao<TicketModel> implements TicketsDao
{

	public DefaultTicketsDao()
	{
		super(TicketModel._TYPECODE);
	}

	@Override
	public TicketModel findTicketsByFlight(final String code, final String passport)
	{
		final String query = "SELECT {t.PK} FROM { Flight as f \r\n" + "\r\n" + "        JOIN Flight2PassengerRelation AS ff  \r\n"
				+ "        ON {ff.source} = {f.PK}   \r\n" + "        \r\n" + "        JOIN Passenger AS p  \r\n"
				+ "        ON {ff.target} = {p.PK}  \r\n" + "        \r\n" + "        JOIN Ticket AS t  \r\n"
				+ "        ON {t.passenger} = {p.PK}\r\n" + "        \r\n"
				+ "} WHERE {f.code} LIKE ?code AND {p.passport} LIKE ?passport";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("code", code);
		fsq.addQueryParameter("passport", passport);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> ticketModels = result.getResult();

		if (ticketModels.size() != 0)
		{
			return ticketModels.get(0);
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<TicketModel> findTicketsListByFlight(final String code)
	{
		final String query = "SELECT {t.PK} FROM { Ticket as t\n" +
				"\n" +
				"\tJOIN Flight as f\n" +
				"    ON {t.flight} = {f.PK}\n" +
				"    \n" +
				"    JOIN Passenger as p\n" +
				"    ON {t.passenger} = {p.PK}\n" +
				"   \n" +
				"} WHERE {f.code} LIKE ?code";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("code", code);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> ticketModels = result.getResult();

		return ticketModels;
	}

}
