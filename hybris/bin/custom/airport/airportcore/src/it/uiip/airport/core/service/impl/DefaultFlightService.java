/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.service.FlightService;


/**
 * @author pasop
 *
 */
public class DefaultFlightService implements FlightService
{

	FlightDao flightDao;

	@Override
	public List<FlightModel> getAllFlights()
	{
		// XXX Auto-generated method stub
		return flightDao.findAllFlights();
	}

	@Override
	public FlightModel getFlightByTicket(String code) {
		return flightDao.findFlightByTicket(code);
	}

	@Override
	public List<TicketModel> getTicketByFlight(String code) {
		return flightDao.findTicketByFlight(code);
	}

	@Override
	public FlightModel getFlightByCode(String code) {
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
	@Required
	public void setFlightDao(final FlightDao flightDao)
	{
		this.flightDao = flightDao;
	}

}
