/**
 *
 */
package it.uiip.airport.core.service.impl;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;


/**
 * @author sdeli
 *
 */
public class DefaultAirportService implements AirportService
{
	AirportDao airportDao;

	@Override
	public AirportModel getAirportforcode(final String code)
	{
		return airportDao.findAirportByCode(code);

	}

	/**
	 * @return the airportDao
	 */
	public AirportDao getAirportDao()
	{
		return airportDao;
	}

	/**
	 * @param airportDao
	 *           the airportDao to set
	 */
	@Required
	public void setAirportDao(final AirportDao airportDao)
	{
		this.airportDao = airportDao;
	}




}
