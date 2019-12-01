/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.PassengerData;


/**
 * @author SimonaBranca
 *
 */
public interface PassengerFacade
{

	List<PassengerData> searchPassengersForCodeFlight(String code);
}
