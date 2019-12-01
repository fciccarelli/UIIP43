/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;
import it.uiip.airport.core.service.impl.DefaultFlightService;
import it.uiip.airport.facades.FlightFacade;


/**
 * @author ASUS
 *
 */
public class DefaultFlightFacade implements FlightFacade
{
	private FlightService flightService;
	private Converter<FlightModel, FlightData> flightConverter;

	@Override
	public FlightData getFlightByCode(final String code)
	{
		final FlightModel flightModel = getFlightService().getFlightForCode(code);
		return flightConverter.convert(flightModel);

	}


	/**
	 * @return the airportService
	 */
	public FlightService getFlightService()
	{
		return flightService;
	}


	/**
	 * @param flightService
	 *           the airportService to set
	 */
	@Required
	public void setFlightService(final DefaultFlightService flightService)
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
	public void setflightConverter(final Converter<FlightModel, FlightData> flightConverter)
	{
		this.flightConverter = flightConverter;
	}


}
