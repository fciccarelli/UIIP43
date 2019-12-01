/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.AirportModel;


/**
 * @author fabiosessa
 *
 */
public interface AirportService
{
	public AirportModel getAirportforcode(String code);
}
