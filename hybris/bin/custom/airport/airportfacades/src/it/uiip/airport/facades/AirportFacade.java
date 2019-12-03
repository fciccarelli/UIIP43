/**
 *
 */
package it.uiip.airport.facades;

import bootstrap.gensrc.it.uiip.airport.facades.data.AirportData;


/**
 * @author asus
 *
 */
public interface AirportFacade
{
	AirportData getAirportByCode(String code);
}
