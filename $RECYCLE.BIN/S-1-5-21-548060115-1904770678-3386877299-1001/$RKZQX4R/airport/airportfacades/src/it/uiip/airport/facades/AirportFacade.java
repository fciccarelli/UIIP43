/**
 *
 */
package it.uiip.airport.facades;

import it.uiip.airport.facades.data.AirportData;


/**
 * @author sdeli
 *
 */
public interface AirportFacade
{
	AirportData getAirportByCode(String code);
}
