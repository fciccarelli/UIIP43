/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketsDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketsService;

/**
 * @author fabiosessa
 *
 */
public class DefaultTicketService implements TicketsService
{
	TicketsDao ticketDao;


	/**
	 * @return the ticketDao
	 */
	public TicketsDao getTicketDao()
	{
		return ticketDao;
	}


	/**
	 * @param ticketDao
	 *           the ticketDao to set
	 */
	@Required
	public void setTicketDao(final TicketsDao ticketDao)
	{
		this.ticketDao = ticketDao;
	}


	@Override
	public TicketModel getTicketForCode(final String code)
	{
		// XXX Auto-generated method stub
		return ticketDao.findTicketByCode(code);
	}


	@Override
	public List<PassengerModel> getPassengerForCodeTicket(final String code)
	{
		// XXX Auto-generated method stub
		return (List<PassengerModel>) ticketDao.findTicketByCode(code);
	}

}
