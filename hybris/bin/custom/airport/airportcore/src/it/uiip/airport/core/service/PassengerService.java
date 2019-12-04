/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author SimonaBranca
 *
 */
public interface PassengerService
{
	List<PassengerModel> getPassengersForCodeFlight(String code);

	List<PassengerModel> getPassengersForCodeTicket(String code);
}
