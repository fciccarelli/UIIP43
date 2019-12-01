/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.ticket.dao.TicketDao;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public abstract class DefaultTicketDao extends DefaultGenericDao<TicketModel> implements TicketDao
{

	/**
	 * @param typecode
	 */
	public DefaultTicketDao(final String typecode)
	{
		super(TicketModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}

	public List<TicketModel> findTicketByCode(final String code)
	{

		final String queryStr = "SELECT {PK} FROM {Ticket} WHERE {code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> tickets = result.getResult();

		return tickets;
	}
}
