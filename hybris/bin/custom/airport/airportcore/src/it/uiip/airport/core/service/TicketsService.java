/**
 *
 */
package it.uiip.airport.core.service;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author fabiosessa
 *
 */
public interface TicketsService
{
	public TicketModel getTicketForCode(String code);
}
