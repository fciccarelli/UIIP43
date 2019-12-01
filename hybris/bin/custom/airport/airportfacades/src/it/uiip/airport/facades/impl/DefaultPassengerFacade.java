/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.core.service.impl.DefaultPassengerService;
import it.uiip.airport.facades.PassengerData;
import it.uiip.airport.facades.PassengerFacade;


/**
 * @author ASUS
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	private PassengerService passengerService;
	private Converter<PassengerModel, PassengerData> passengerConverter;

	@Override
	public PassengerData getPassengerByCode(final String name, final String surname)
	{

		final PassengerModel passengerModel = getPassengerService().getPassengerForPassport(name, surname);
		return passengerConverter.convert(passengerModel);

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
	 *           the airportService to set
	 */
	@Required
	public void setPassengerService(final DefaultPassengerService passengerService)
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
