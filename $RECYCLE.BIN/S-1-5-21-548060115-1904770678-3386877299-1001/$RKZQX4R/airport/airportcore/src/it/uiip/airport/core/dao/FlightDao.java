/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.List;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author pasop
 *
 */
public interface FlightDao
{
	List<FlightModel> findAllFlights();
}
