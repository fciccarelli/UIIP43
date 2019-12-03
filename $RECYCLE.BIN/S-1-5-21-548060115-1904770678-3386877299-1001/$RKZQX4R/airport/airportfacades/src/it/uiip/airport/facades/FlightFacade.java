/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.FlightData;


/**
 * @author pasop
 *
 */
public interface FlightFacade
{
	List<FlightData> getAllFlights();
}
