/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import it.uiip.airport.core.dao.TicketsDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;

/**
 * @author fabiosessa
 *
 */
public class DefaultTicketDao extends DefaultGenericDao<TicketModel> implements TicketsDao
{

	/**
	 * @param typecode
	 */
	public DefaultTicketDao()
	{
		super(TicketModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}

	@Override
	public TicketModel findTicketByCode(final String code)
	{
		// XXX Auto-generated method stub
		final String queryStr = "Select {PK} from {Ticket} where {code}= ?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final TicketModel ticket = (TicketModel) result.getResult();
		return ticket;
	}

}
