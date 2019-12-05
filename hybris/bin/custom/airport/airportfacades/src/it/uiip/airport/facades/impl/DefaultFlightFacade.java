/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.facades.data.AirportData;
import ma.glasnost.orika.impl.generator.specification.Convert;
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
	Converter<AirportModel, AirportData> airportConverter;

	@Override
	public List<FlightData> getAllFlights()
	{
		final List<FlightModel> flightModels = flightService.getAllFlights();
		List<FlightData> flightData =flightConverter.convertAll(flightModels);
		for(int i = 0; i< flightModels.size(); i++){
			flightData.get(i).setDepartureAirport(airportConverter.convert(flightModels.get(i).getDepartureAirport()));
			flightData.get(i).setArrivalAirport(airportConverter.convert(flightModels.get(i).getArrivalAirport()));
		}
		return flightData;
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

	public Converter<AirportModel, AirportData> getAirportConverter() {
		return airportConverter;
	}

	@Required
	public void setAirportConverter(Converter<AirportModel, AirportData> airportConverter) {
		this.airportConverter = airportConverter;
	}
}
