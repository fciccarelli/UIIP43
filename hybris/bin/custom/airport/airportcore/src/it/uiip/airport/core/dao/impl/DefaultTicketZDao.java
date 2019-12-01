/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.TicketZDao;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author aDeangelis
 *
 */
public class DefaultTicketZDao extends DefaultGenericDao<TicketModel> implements TicketZDao
{

	/**
	 * @param typecode
	 */
	public DefaultTicketZDao()
	{
		super(TicketModel._TYPECODE);
	}

	@Override
	public List<TicketModel> findTicketByCodeFlight(final String code)
	{
		final String queryStr = "SELECT {p.name},{p.surname},{t.code},{t.numberSeat} FROM { Flight as f Join Ticket as t ON {t.flight} = {f.pk} Join Passenger as p ON {p.pk} = {t.passenger}} where {code} = ?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> tickets = result.getResult();

		return tickets;
	}



}
