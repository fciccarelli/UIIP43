/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketData;


/**
 * @author asus
 *
 */
public interface TicketZFacade
{
	List<TicketData> getTicketByCodeFlight(String code);
}
