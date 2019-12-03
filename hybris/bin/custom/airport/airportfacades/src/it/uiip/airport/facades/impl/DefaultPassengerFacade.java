/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.impl.DefaultTicketZService;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;

/**
 * @author sdeli
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	DefaultTicketZService ticketZService;
	private Converter<PassengerModel, PassengerData> passengerConverter;

	@Override
	public List<PassengerData> getPassengerByTicket(final String code)
	{
		final List<TicketModel> listTicket = ticketZService.getTicketForCode(code);
		final List<PassengerModel> listPass = null;
		for (final TicketModel ticket : listTicket)
		{
			listPass.add(ticket.getPassenger());

		}
		return passengerConverter.convertAll(listPass);
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
	 * @return the passengerConverter
	 */
	public Converter<PassengerModel, PassengerData> getPassengerConverter()
	{
		return passengerConverter;
	}

	/**
	 * @param passengerConverter
	 *           the passengerConverter to set
	 */
	@Required
	public void setPassengerConverter(final Converter<PassengerModel, PassengerData> passengerConverter)
	{
		this.passengerConverter = passengerConverter;
	}


}
