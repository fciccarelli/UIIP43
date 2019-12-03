/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.facades.data.TicketZData;




/**
 * @author aDeangelis
 *
 */
public interface TicketZFacade
{
	List<TicketZData> getTicketByCodeFlight(String code);
}
