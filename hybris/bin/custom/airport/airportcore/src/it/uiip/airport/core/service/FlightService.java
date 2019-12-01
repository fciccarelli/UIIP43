/**
 *
 */
package it.uiip.airport.core.service;


import it.uiip.airport.core.model.FlightModel;


/**
 * @author ASUS
 *
 */
public interface FlightService
{
	FlightModel getFlightForCode(String code);
}
