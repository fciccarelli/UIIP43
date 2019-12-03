package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.TicketZData;


/**
 * @author soprasteria
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	DefaultPassengerFacade PassengerFacade;
	private Converter<TicketModel, TicketZData> ticketZConverter;
	
	@Override
	public List<PassengerData> getPassengerByTicket(final String code)
	{
		// XXX Auto-generated method stub
		return null;
	}




}
