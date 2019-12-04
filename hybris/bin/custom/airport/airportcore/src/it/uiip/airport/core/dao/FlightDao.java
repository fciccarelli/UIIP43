/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.List;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public interface FlightDao
{
	List<FlightModel> findAllFlights();
	FlightModel findFlightByTicket(String ticketCode);
	List<TicketModel> findTicketByFlight(String code);
	FlightModel findFlightByCode(String code);
}
