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
		final String query = " SELECT {t.PK} FROM { Flight as f  JOIN Flight2PassengerRelation AS ff  ON {ff.source} = {f.PK} "
				+ "  JOIN Passenger AS p " + " ON {ff.target} = {p.PK}  JOIN Ticket AS t " + " ON {t.passenger} = {p.PK} "
				+ " }WHERE {f.code} LIKE '1' AND {p.passport} LIKE '?passport' ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> ticketModels = result.getResult();
		return ticketModels.get(0);
	}

}
