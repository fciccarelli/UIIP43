/**
 *
 */
package it.uiip.airport.facade;

import java.util.List;

import it.uiip.airport.facades.data.PassengerData;


/**
 * @author fabiosessa
 *
 */
public interface PassengerFacade
{
	public List<PassengerData> searchPassenger(String code);
}
