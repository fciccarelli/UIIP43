/**
 *
 */
package it.uiip.airport.facedes;

import it.uiip.airport.facades.data.AirportData;


/**
 * @author sdeli
 *
 */
public interface AirportFacade
{
	AirportData getAirportByCode(String code);
}
