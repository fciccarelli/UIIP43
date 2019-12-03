/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.PassengerData;


/**
 * @author sdeli
 *
 */
public interface PassengerFacade
{
	List<PassengerData> getPassengerByTicket(String code);
}
