/**
 *
 */
package it.uiip.airport.facades;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.TicketsData;


/**
 * @author pasop
 *
 */
public interface TicketsFacade
{
	public List<TicketsData> getTicketsForFlight(String code, String passport);
	public List<TicketsData> getTicketsListForFlight(String code);
	public void setTicket(TicketsData ticketData);

}
