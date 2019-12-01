/**
 * 
 */
package it.uiip.airport.facades;

import it.uiip.airport.facades.data.AirportData;

/**
 * @author ASUS
 *
 */
public interface FlightFacade
{
	FlightData getFlightByCode(String code);
}
