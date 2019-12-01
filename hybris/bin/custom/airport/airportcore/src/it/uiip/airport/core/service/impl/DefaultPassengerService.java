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
 * @author pasop
 *
 */
public class DefaultPassengerService implements PassengerService
{
	PassengerDao passengerDao;

	@Override
	public List<PassengerModel> getPassengersForFlight(final String code)
	{
		return passengerDao.findPassengersByFlight(code);

	}

	@Override
	public List<PassengerModel> PassengerForNameSurname(final String name, final String surname)
	{
		return passengerDao.findPassengerByNameSurname(name, surname);
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
