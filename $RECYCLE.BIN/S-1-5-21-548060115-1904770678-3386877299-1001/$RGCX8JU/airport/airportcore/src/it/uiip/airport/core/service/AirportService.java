/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.AirportModel;


/**
 * @author sdeli
 *
 */
public interface AirportService
{
	AirportModel getAirportforcode(String code);
}
