/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author pasop
 *
 */
public interface PassengerService
{
	List<PassengerModel> PassengerForNameSurname(String name, String surname);

	List<PassengerModel> getPassengersForFlight(String code);

	List<PassengerModel> getPassengersForTicket(String code);

}
