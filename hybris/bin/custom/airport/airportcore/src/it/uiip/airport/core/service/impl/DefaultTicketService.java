/**
 *
 */
package it.uiip.airport.core.service.impl;

import de.hybris.platform.ticket.dao.TicketDao;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;


/**
 * @author ASUS
 *
 */
public class DefaultTicketService implements TicketService
{
	TicketDao ticketDao;

	@Override
	public TicketModel getTicketForCode(final String code)
	{
		return ticketDao.findTicketByCode(code);

	}

	/**
	 * @return the ticketDao
	 */
	public TicketDao getTicketDao()
	{
		return ticketDao;
	}

	/**
	 * @param ticketDao
	 *           the ticketDao to set
	 */
	public void setTicketDao(final TicketDao ticketDao)
	{
		this.ticketDao = ticketDao;
	}


}
