/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketsData;


/**
 * @author SimonaBranca
 *
 */
public interface TicketsFacade
{

	List<TicketsData> searchTicketsForCodeFlight(String code);
}
