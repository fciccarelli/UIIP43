/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketData;


/**
 * @author aDeangelis
 *
 */
public interface TicketZFacade
{
	List<TicketData> getTicketByCodeFlight(String code);
}
