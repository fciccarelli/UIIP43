/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.core.service.TicketsService;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.TicketsData;


/**
 * @author pasop
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	PassengerService passengerService;
	Converter<PassengerModel, PassengerData> passengerConverter;
	TicketsService ticketsService;
	Converter<TicketModel, TicketsData> ticketsConverter;

	@Override
	public List<PassengerData> getPassengersByFlight(final String code)
	{
		final List<PassengerModel> passengersModel = passengerService.getPassengersForFlight(code);
		final List<PassengerData> passengersData = passengerConverter.convertAll(passengersModel);

		for (int i = 0; i < passengersModel.size(); i++)
		{

			passengersData.get(i).setTicket(
					ticketsConverter.convert(ticketsService.getTicketForFlight(code, passengersModel.get(i).getPassport())));

		}
		return passengersData;
	}

	/**
	 * @return the passengerService
	 */
	public PassengerService getPassengerService()
	{
		return passengerService;
	}

	/**
	 * @param passengerService
	 *           the passengerService to set
	 */
	@Required
	public void setPassengerService(final PassengerService passengerService)
	{
		this.passengerService = passengerService;
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
