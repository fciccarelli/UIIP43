/**
 *
 */
package it.uiip.airport.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.facade.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;





/**
 * @author fabiosessa
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{
	private PassengerService passengerService;
	private Converter<PassengerModel, PassengerData> passengerConverter;





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

	@Override
	public PassengerData searchPassenger(final String code)
	{
		// XXX Auto-generated method stub

		final PassengerModel passengerModel = getPassengerService().getPassengerForCode(code);
		return passengerConverter.convert(passengerModel);
	}
}
