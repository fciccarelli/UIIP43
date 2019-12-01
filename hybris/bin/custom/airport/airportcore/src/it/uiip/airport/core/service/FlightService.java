/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author fabiosessa
 *
 */
public interface FlightService
{
	public FlightModel getFlightforcode(String code);
}
