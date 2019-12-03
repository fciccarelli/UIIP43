/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;
import it.uiip.airport.facades.FlightFacade;
import it.uiip.airport.facades.data.FlightData;


/**
 * @author pasop
 *
 */
public class DefaultFlightFacade implements FlightFacade
{

	FlightService flightService;
	Converter<FlightModel, FlightData> flightConverter;

	@Override
	public List<FlightData> getAllFlights()
	{
		final List<FlightModel> flightModels = flightService.getAllFlights();
		return flightConverter.convertAll(flightModels);
	}

	/**
	 * @return the flightService
	 */
	public FlightService getFlightService()
	{
		return flightService;
	}

	/**
	 * @param flightService
	 *           the flightService to set
	 */
	@Required
	public void setFlightService(final FlightService flightService)
	{
		this.flightService = flightService;
	}

	/**
	 * @return the flightConverter
	 */
	public Converter<FlightModel, FlightData> getFlightConverter()
	{
		return flightConverter;
	}

	/**
	 * @param flightConverter
	 *           the flightConverter to set
	 */
	@Required
	public void setFlightConverter(final Converter<FlightModel, FlightData> flightConverter)
	{
		this.flightConverter = flightConverter;
	}


}
