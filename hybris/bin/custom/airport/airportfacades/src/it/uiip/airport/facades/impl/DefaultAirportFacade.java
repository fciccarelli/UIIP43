/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.impl.DefaultAirportService;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facedes.AirportFacade;


/**
 * @author sdeli
 *
 */
public class DefaultAirportFacade implements AirportFacade
{

	private DefaultAirportService airportService;
	private Converter<AirportModel, AirportData> airportConverter;


	@Override
	public AirportData getAirportByCode(final String code)
	{
		final AirportModel airportModel = getAirportService().getAirportforcode(code);
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
	 * @return the airportConverter
	 */
	public Converter<AirportModel, AirportData> getAirportConverter()
	{
		return airportConverter;
	}


	/**
	 * @param airportConverter
	 *           the airportConverter to set
	 */
	@Required
	public void setAirportConverter(final Converter<AirportModel, AirportData> airportConverter)
	{
		this.airportConverter = airportConverter;
	}


}