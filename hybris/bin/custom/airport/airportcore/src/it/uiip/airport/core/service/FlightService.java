/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public interface FlightService
{
	List<FlightModel> getAllFlights();
	FlightModel getFlightByTicket(String code);
	List<TicketModel> getTicketByFlight(String code);
	FlightModel getFlightByCode(String code);
}
