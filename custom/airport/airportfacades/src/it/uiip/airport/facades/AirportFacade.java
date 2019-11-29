/**
 *
 */
package it.uiip.airport.facades;

import it.uiip.airport.facades.data.AirportData;



/**
 * @author pasop
 *
 */
public interface AirportFacade
{
	public AirportData searchAirport(final String code);
}
