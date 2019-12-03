/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.impl.DefaultTicketZService;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;


/**
 * @author Luigi
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	DefaultTicketZService ticketZService;
	Converter<PassengerModel, PassengerData> passengerConverter;

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

}
