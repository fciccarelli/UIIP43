/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;


/**
 * @author pasop
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	PassengerService passengerService;
	Converter<PassengerModel, PassengerData> passengerConverter;

	@Override
	public List<PassengerData> getPassengersByFlight(final String code)
	{
		final List<PassengerData> passengersData = null;
		final List<PassengerModel> passengersModel = passengerService.getPassengersForFlight(code);
		for (final PassengerModel p : passengersModel)
		{
			passengersData.add(passengerConverter.convert(p));
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

}
