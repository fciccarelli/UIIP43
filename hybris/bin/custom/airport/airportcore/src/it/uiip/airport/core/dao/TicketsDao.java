/**
 *
 */
package it.uiip.airport.core.dao;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public interface TicketsDao
{
	TicketModel findTicketsByFlight(String code, String passport);
}
