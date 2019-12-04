/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author fabiosessa
 *
 */
public interface TicketsService
{
	public TicketModel getTicketForCode(String code);

	public List<PassengerModel> getPassengerForCodeTicket(String code);

}
