/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.PassengerModel;

/**
 * @author Luigi
 *
 */
public interface PassengerService
{
	PassengerModel getPassengerForCode(String code);
}
