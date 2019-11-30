/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.PassengerData;


/**
 * @author pasop
 *
 */
public interface PassengerFacade
{
	List<PassengerData> getPassengersByFlight(String code);
}
