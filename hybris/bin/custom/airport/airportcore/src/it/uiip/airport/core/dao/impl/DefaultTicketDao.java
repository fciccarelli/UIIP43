/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public class DefaultTicketDao extends DefaultGenericDao<TicketModel> implements TicketDao
{

	public DefaultTicketDao() {
		super(TicketModel._TYPECODE);
	}

	@Override
	public List<TicketModel> findAllTickets()
	{
		final String query = "SELECT {PK} FROM {Tickect}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<TicketModel> result = getFlexibleSearchService().search(fsq);
		final List<TicketModel> ticketModels = result.getResult();
		return ticketModels;
	}

}
