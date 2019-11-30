/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketsData;


/**
 * @author pasop
 *
 */
public interface TicketsFacade
{
	List<TicketsData> getAllTickets();
}
