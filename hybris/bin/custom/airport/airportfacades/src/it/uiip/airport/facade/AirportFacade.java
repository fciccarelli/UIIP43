/**
 *
 */
package it.uiip.airport.facade;

import it.uiip.airport.facades.data.AirportData;

/**
 * @author fabiosessa
 *
 */
public interface AirportFacade
{
	public AirportData searchAirport(String code);
}
