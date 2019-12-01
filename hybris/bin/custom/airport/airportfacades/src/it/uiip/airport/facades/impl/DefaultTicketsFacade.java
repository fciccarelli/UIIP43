/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketsService;
import it.uiip.airport.facades.TicketsFacade;
import it.uiip.airport.facades.data.TicketsData;


/**
 * @author pasop
 *
 */
public class DefaultTicketsFacade implements TicketsFacade
{

	TicketsService ticketsService;
	Converter<TicketModel, TicketsData> ticketsConverter;


	@Override
	public List<TicketsData> getTickets(final String code)
	{
		return null;
	}


	/**
	 * @return the ticketsService
	 */
	public TicketsService getTicketsService()
	{
		return ticketsService;
	}


	/**
	 * @param ticketsService
	 *           the ticketsService to set
	 */
	@Required
	public void setTicketsService(final TicketsService ticketsService)
	{
		this.ticketsService = ticketsService;
	}


	/**
	 * @return the ticketsConverter
	 */
	public Converter<TicketModel, TicketsData> getTicketsConverter()
	{
		return ticketsConverter;
	}


	/**
	 * @param ticketsConverter
	 *           the ticketsConverter to set
	 */
	@Required
	public void setTicketsConverter(final Converter<TicketModel, TicketsData> ticketsConverter)
	{
		this.ticketsConverter = ticketsConverter;
	}





}
