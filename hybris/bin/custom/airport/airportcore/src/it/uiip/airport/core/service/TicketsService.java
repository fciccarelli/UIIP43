/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.TicketModel;

import java.util.List;


/**
 * @author pasop
 *
 */
public interface TicketsService
{
	TicketModel getTicketForFlight(String code, String passport);
	List<TicketModel> getTicketsForFlight(String code);

}
