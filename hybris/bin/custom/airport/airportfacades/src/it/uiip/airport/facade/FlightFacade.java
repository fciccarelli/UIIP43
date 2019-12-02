/**
 *
 */
package it.uiip.airport.facade;

import it.uiip.airport.facades.data.FlightData;


/**
 * @author fabiosessa
 *
 */
public interface FlightFacade
{
	public FlightData searchFlight(String code);
}
