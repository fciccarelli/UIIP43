/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.impl.DefaultTicketZService;
import it.uiip.airport.facades.TicketZFacade;
import it.uiip.airport.facades.data.TicketZData;


/**
 * @author aDeangelis
 *
 */
public class DefaultTicketZFacade implements TicketZFacade
{

	private DefaultTicketZService ticketZService;
	private Converter<TicketModel, TicketZData> ticketZConverter;

	@Override
	public List<TicketZData> getTicketByCodeFlight(final String code)
	{
		final TicketModel listTicket = (TicketModel) getTicketZService().getTicketForCode(code);
		return (List<TicketZData>) ticketZConverter.convert(listTicket);
	}

	/**
	 * @return the ticketZService
	 */
	public DefaultTicketZService getTicketZService()
	{
		return ticketZService;
	}

	/**
	 * @param ticketZService
	 *           the ticketZService to set
	 */
	@Required
	public void setTicketZService(final DefaultTicketZService ticketZService)
	{
		this.ticketZService = ticketZService;
	}

	/**
	 * @return the ticketZConverter
	 */
	public Converter<TicketModel, TicketZData> getTicketZConverter()
	{
		return ticketZConverter;
	}

	/**
	 * @param ticketZConverter
	 *           the ticketZConverter to set
	 */
	@Required
	public void setTicketZConverter(final Converter<TicketModel, TicketZData> ticketZConverter)
	{
		this.ticketZConverter = ticketZConverter;
	}



}
