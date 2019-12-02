/**
 *
 */
package it.uiip.airport.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;
import it.uiip.airport.facade.FlightFacade;
import it.uiip.airport.facades.data.FlightData;



/**
 * @author fabiosessa
 *
 */
public class DefaultFlightFacade implements FlightFacade
{
	private FlightService flightService;
	private Converter<FlightModel, FlightData> flightConverter;


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


	@Override
	public FlightData searchFlight(final String code)
	{
		// XXX Auto-generated method stub
		final FlightModel flightModel = getFlightService().getFlightforcode(code);
		return flightConverter.convert(flightModel);
	}
}
