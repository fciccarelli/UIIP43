/**
 *
 */
package it.uiip.airport.core.service.impl;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;


/**
 * @author Luigi
 *
 */
public class DefaultPassengerService implements PassengerService
{

	PassengerDao passengerDao;

	@Override
	public PassengerModel getPassengerForCode(final String code)
	{

		return (PassengerModel) passengerDao.findPassengerByCode(code);
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
