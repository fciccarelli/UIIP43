/**
 *
 */
package it.uiip.airport.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;


/**
 * @author SimonaBranca
 *
 */
public class DefaultPassengerFacade implements PassengerFacade
{

	private PassengerService passengerService;
	private Converter<PassengerModel, PassengerData>  passengerConverter;

	@Override
	//	public PassengerData searchPassengersForCodeFlight(final String code)
	//	{
	//
	//		final PassengerModel passengerModel = (PassengerModel) getPassengerService().getPassengersForCodeFlight(code);
	//		return passengerConverter.convert(passengerModel);
	//	}

	public List<PassengerData> searchPassengersForCodeFlight(final String code)
	{

		final List<PassengerModel> passengers = passengerService.getPassengersForCodeFlight(code);
		final List<PassengerData> passengersData = new ArrayList<PassengerData>();

		for (final PassengerModel passengerModel : passengers)
		{
			final PassengerData passengerData = passengerConverter.convert(passengerModel);
			passengersData.add(passengerData);

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
	 * @param passengerService the passengerService to set
	 */
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
	 * @param passengerConverter the passengerConverter to set
	 */
	public void setPassengerConverter(final Converter<PassengerModel, PassengerData> passengerConverter)
	{
		this.passengerConverter = passengerConverter;
	}



}
