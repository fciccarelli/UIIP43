/**
 *
 */
package it.uiip.airport.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketsService;
import it.uiip.airport.facade.TicketsFacade;
import it.uiip.airport.facades.data.TicketsData;


/**
 * @author fabiosessa
 *
 */
public class DefaultTicketsFacade implements TicketsFacade
{
	private TicketsService ticketService;
	private Converter<TicketModel, TicketsData> ticketConverter;


	/**
	 * @return the ticketService
	 */
	public TicketsService getTicketService()
	{
		return ticketService;
	}


	/**
	 * @param ticketService
	 *           the ticketService to set
	 */
	@Required
	public void setTicketService(final TicketsService ticketService)
	{
		this.ticketService = ticketService;
	}


	/**
	 * @return the ticketConverter
	 */
	public Converter<TicketModel, TicketsData> getTicketConverter()
	{
		return ticketConverter;
	}


	/**
	 * @param ticketConverter
	 *           the ticketConverter to set
	 */
	@Required
	public void setTicketConverter(final Converter<TicketModel, TicketsData> ticketConverter)
	{
		this.ticketConverter = ticketConverter;
	}


	@Override
	public TicketsData searchTicket(final String code)
	{
		// XXX Auto-generated method stub
		final TicketModel ticketModel = getTicketService().getTicketForCode(code);
		return ticketConverter.convert(ticketModel);
	}

}
