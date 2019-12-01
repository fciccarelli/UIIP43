/**
 *
 */
package it.uiip.airport.core.service;


import it.uiip.airport.core.model.PassengerModel;


/**
 * @author ASUS
 *
 */
public interface PassengerService
{
	PassengerModel getPassengerForPassport(String name, String surname);
}
