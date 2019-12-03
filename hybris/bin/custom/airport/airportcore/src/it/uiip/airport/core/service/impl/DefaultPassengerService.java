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
 * @author fabiosessa
 *
 */
public class DefaultPassengerService implements PassengerService
{
	PassengerDao passengerDao;

	@Override
	public List<PassengerModel> getPassengerForCode(final String code)
	{
		// XXX Auto-generated method stub
		return passengerDao.findPassengerByCode(code);
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
