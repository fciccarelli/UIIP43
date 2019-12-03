/**
 *
 */
package it.uiip.airport.core.service;

import bootstrap.gensrc.it.uiip.airport.core.model.AirportModel;


/**
 * @author asus
 *
 */
public interface AirportService
{
	AirportModel getAirportforcode(String code);
}
