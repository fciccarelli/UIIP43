/**
 *
 */
package it.uiip.airport.facade;

import it.uiip.airport.facades.data.TicketsData;


/**
 * @author fabiosessa
 *
 */
public interface TicketsFacade
{
	public TicketsData searchTicket(String code);
}
