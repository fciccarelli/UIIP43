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
 * @author SimonaBranca
 *
 */
public class DefaultTicketsDao extends DefaultGenericDao<TicketModel> implements TicketsDao
{

	/**
	 * @param typecode
	 */
	public DefaultTicketsDao()
	{
		super(TicketModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<TicketModel> findTicketsByCodeFlight(final String code)
	{
		final String queryStr = "SELECT {t.pk},{t.code},{t.numberSeat} FROM {Ticket as t JOIN Flight as f on {f.pk } = {t.flight } JOIN Passenger as p  on {p.pk } = {t.passenger }} where {f.code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> tickets = result.getResult();

		return tickets;
	}

}//SELECT {t.pk} FROM {Ticket as t JOIN Flight as f on {f.pk } = {t.flight }} where {f.code}
