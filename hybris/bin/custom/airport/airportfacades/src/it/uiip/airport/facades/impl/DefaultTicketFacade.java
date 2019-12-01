/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketService;
import it.uiip.airport.core.service.impl.DefaultTicketService;



/**
 * @author ASUS
 *
 */
public class DefaultTicketFacade
{
	private TicketService ticketService;
	private Converter<TicketModel, TicketData> ticketConverter;

	@Override
	public TicketData getTicketForCode(final String code)
	{

		final TicketModel ticketModel = getTicketService().getTicketForCode(code);
		return ticketConverter.convert(ticketModel);

	}


	/**
	 * @return the TicketService
	 */
	public TicketService getTicketService()
	{
		return ticketService;
	}


	/**
	 * @param TicketService
	 *           the airportService to set
	 */
	@Required
	public void setTicketService(final DefaultTicketService ticketService)
	{
		this.TicketService = ticketService;
	}


	/**
	 * @return the TicketConverter
	 */
	public Converter<TicketModel, TicketData> getTicketConverter()
	{
		return TicketConverter;
	}


	/**
	 * @param TicketConverter
	 *           the TicketConverter to set
	 */
	@Required
	public void setTicketConverter(final Converter<TicketModel, TicketData> TicketConverter)
	{
		this.TicketConverter = TicketConverter;
	}
}
