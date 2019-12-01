/**
 *
 */
package it.uiip.airport.core.service.impl;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.service.AirportService;


/**
 * @author fabiosessa
 *
 */
public class DefaultAirportService implements AirportService
{
	AirportDao airportDao;

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

	@Override
	public AirportModel getAirportforcode(final String code)
	{
		// XXX Auto-generated method stub
		return airportDao.findAirportByCode(code);
	}

}