/**
 *
 */
package it.uiip.airport.core.service.impl;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketsDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketsService;

import java.util.List;


/**
 * @author pasop
 *
 */
public class DefaultTicketsService implements TicketsService
{
	TicketsDao ticketsDao;

	@Override
	public TicketModel getTicketForFlight(final String code, final String passport)
	{
		return ticketsDao.findTicketsByFlight(code, passport);
	}

	@Override
	public
	List<TicketModel> getTicketsForFlight(String code) {
		return ticketsDao.findTicketsListByFlight(code);
	}

	@Override
	public void setTicket(TicketModel ticketModel) {
		ticketsDao.saveTicket(ticketModel);
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
