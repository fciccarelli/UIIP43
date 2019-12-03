/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author SimonaBranca
 *
 */
public interface TicketsService
{
	List<TicketModel> getTicketsForCodeFlight(String code);
}
