/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public interface PassengerService
{
	public List<PassengerModel> getPassengerForCode(String code);
}
