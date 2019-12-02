/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public interface TicketsService
{
	TicketModel getTicketForFlight(String code, String passport);
}
