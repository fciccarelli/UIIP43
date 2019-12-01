/**
 *
 */
package it.uiip.airport.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;
import it.uiip.airport.facade.AirportFacade;
import it.uiip.airport.facades.data.AirportData;


/**
 * @author fabiosessa
 *
 */
public class DefaultAirportFacade implements AirportFacade
{

	private AirportService airportService;
	private Converter<AirportModel, AirportData> airportConverter;





	/**
	 * @return the airportService
	 */
	public AirportService getAirportService()
	{
		return airportService;
	}


	/**
	 * @param airportService
	 *           the airportService to set
	 */
	@Required
	public void setAirportService(final AirportService airportService)
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


	@Override
	public AirportData searchAirport(final String code)
	{
		// XXX Auto-generated method stub
		final AirportModel airportModel = getAirportService().getAirportforcode(code);
		return airportConverter.convert(airportModel);

	}

}
