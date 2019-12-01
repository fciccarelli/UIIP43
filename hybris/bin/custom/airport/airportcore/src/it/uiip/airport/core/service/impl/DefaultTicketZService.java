/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.TicketZDao;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketZService;


/**
 * @author aDeangelis
 *
 */
public class DefaultTicketZService implements TicketZService
{

	TicketZDao ticketZDao;

	@Override
	public List<TicketModel> getTicketForCode(final String code)
	{

		return ticketZDao.findTicketByCodeFlight(code);
	}

	/**
	 * @return the ticketZDao
	 */
	public TicketZDao getTicketZDao()
	{
		return ticketZDao;
	}

	/**
	 * @param ticketZDao
	 *           the ticketZDao to set
	 */
	@Required
	public void setTicketZDao(final TicketZDao ticketZDao)
	{
		this.ticketZDao = ticketZDao;
	}

}
