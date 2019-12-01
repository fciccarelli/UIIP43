/**
 *
 */
package it.uiip.airport.core.service.impl;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;


/**
 * @author ASUS
 *
 */
public class DefaultFlightService
{
	FlightDao flightDao;

	public FlightModel getAirportforcode(final String code)
	{
		return flightDao.findFlightByCode(code);

	}

	/**
	 * @return the flightDao
	 */
	public FlightDao getFlightDao()
	{
		return flightDao;
	}

	/**
	 * @param flightDao
	 *           the flightDao to set
	 */
	public void setFlightDao(final FlightDao flightDao)
	{
		this.flightDao = flightDao;
	}


}
