/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.AirportModel;

/**
 * @author pasop
 *
 */
public interface AirportService
{
	public AirportModel getAirpotForCode(String code);
}
