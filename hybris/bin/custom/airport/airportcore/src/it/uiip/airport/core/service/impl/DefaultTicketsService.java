/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketsDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketsService;


/**
 * @author pasop
 *
 */
public class DefaultTicketsService implements TicketsService
{
	TicketsDao ticketsDao;

	@Override
	public List<TicketModel> getAllTickets()
	{
		return ticketsDao.findAllTickets();
	}

	/**
	 * @return the ticketsDao
	 */
	public TicketsDao getTicketsDao()
	{
		return ticketsDao;
	}

	/**
	 * @param ticketsDao
	 *           the ticketsDao to set
	 */
	@Required
	public void setTicketsDao(final TicketsDao ticketsDao)
	{
		this.ticketsDao = ticketsDao;
	}




}
