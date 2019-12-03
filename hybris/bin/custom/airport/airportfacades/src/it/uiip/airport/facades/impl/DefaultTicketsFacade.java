/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.facades.data.PassengerData;
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
	PassengerService passengerService;
	Converter<PassengerModel, PassengerData> passengerConverter;


	@Override
	public List<TicketsData> getTicketsForFlight(String code, String passport) {
		return null;
	}

	@Override
	public List<TicketsData> getTicketsListForFlight(String code){
		List<TicketModel> ticketsModel = ticketsService.getTicketsForFlight(code);
		List<TicketsData> ticketsData =  ticketsConverter.convertAll(ticketsModel);

		for(int i = 0; i< ticketsData.size(); i++){
			PassengerModel pm = ticketsModel.get(i).getPassenger();
			PassengerData pd = passengerConverter.convert(pm);
			ticketsData.get(i).setPassenger(pd);
		}
		return ticketsData;
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

	public PassengerService getPassengerService() {
		return passengerService;
	}

	@Required
	public void setPassengerService(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	public Converter<PassengerModel, PassengerData> getPassengerConverter() {
		return passengerConverter;
	}

	@Required
	public void setPassengerConverter(Converter<PassengerModel, PassengerData> passengerConverter) {
		this.passengerConverter = passengerConverter;
	}
}
