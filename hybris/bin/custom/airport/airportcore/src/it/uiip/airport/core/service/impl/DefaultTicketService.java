/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;


/**
 * @author pasop
 *
 */
public class DefaultTicketService implements TicketService
{
	TicketDao ticketDao;

	@Override
	public List<TicketModel> getAllTickets()
	{
		return ticketDao.findAllTickets();
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
	@Required
	public void setTicketDao(final TicketDao ticketDao)
	{
		this.ticketDao = ticketDao;
	}


}
