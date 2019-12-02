/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public interface PassengerService
{
	public PassengerModel getPassengerForCode(String code);
}
