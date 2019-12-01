/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;


/**
 * @author SimonaBranca
 *
 */
public class DefaultPassengerService implements PassengerService
{

	private PassengerDao passengerDao;

	@Override
	public List<PassengerModel> getPassengersForCodeFlight(final String code)
	{
		return passengerDao.findPassengersByCodeFlight(code);
	}

	/**
	 * @return the passengerDao
	 */
	public PassengerDao getPassengerDao()
	{
		return passengerDao;
	}

	/**
	 * @param passengerDao
	 *           the passengerDao to set
	 */
	@Required
	public void setPassengerDao(final PassengerDao passengerDao)
	{
		this.passengerDao = passengerDao;
	}


}
