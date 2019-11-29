/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.impl.DefaultAirportService;
import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.data.AirportData;


/**
 * @author pasop
 *
 */
public class DefaultAirportFacade implements AirportFacade
{

	private DefaultAirportService airportService;
	private Converter<AirportModel, AirportData> airportConverter;

	@Override
	public AirportData searchAirport(final String code)
	{
		// XXX Auto-generated method stub
		final AirportModel airportModel = airportService.getAirpotForCode(code);
		return airportConverter.convert(airportModel);
	}

	/**
	 * @return the airportService
	 */
	public DefaultAirportService getAirportService()
	{
		return airportService;
	}

	/**
	 * @param airportService
	 *           the airportService to set
	 */
	@Required
	public void setAirportService(final DefaultAirportService airportService)
	{
		this.airportService = airportService;
	}

	/**
	 * @return the airportModelToDataConverter
	 */
	public Converter<AirportModel, AirportData> getAirportModelToDataConverter()
	{
		return airportConverter;
	}

	/**
	 * @param airportModelToDataConverter
	 *           the airportModelToDataConverter to set
	 */
	@Required
	public void setAirportModelToDataConverter(final Converter<AirportModel, AirportData> airportModelToDataConverter)
	{
		this.airportConverter = airportModelToDataConverter;
	}



}
