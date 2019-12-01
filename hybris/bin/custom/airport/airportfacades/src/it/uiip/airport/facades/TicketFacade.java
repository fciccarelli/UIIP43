/**
 * 
 */
package it.uiip.airport.facades;

import it.uiip.airport.facades.data.AirportData;

/**
 * @author ASUS
 *
 */
public interface TicketFacade
{
	TicketData getTicketByCode(String code);
}
