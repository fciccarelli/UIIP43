/**
 *
 */
package it.uiip.airport.core.service.impl;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;

/**
 * @author ASUS
 *
 */
public class DefaultPassengerService implements PassengerService
{


	PassengerDao passengerDao;

	@Override
	public PassengerModel getPassengerForPassport(final String name, final String surname)
	{

		return (PassengerModel) passengerDao.findPassengerByNameSurname(name, surname);

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
	public void setPassengerDao(final PassengerDao passengerDao)
	{
		this.passengerDao = passengerDao;
	}

}
