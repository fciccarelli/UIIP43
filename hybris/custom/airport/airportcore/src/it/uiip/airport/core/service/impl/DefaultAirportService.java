/**
 *
 */
package it.uiip.airport.core.service.impl;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;


/**
 * @author pasop
 *
 */
public class DefaultAirportService implements AirportService
{
	private AirportDao airportDao;

	@Override
	public AirportModel getAirpotForCode(final String code)
	{
		return airportDao.findAirportsByCode(code);
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
