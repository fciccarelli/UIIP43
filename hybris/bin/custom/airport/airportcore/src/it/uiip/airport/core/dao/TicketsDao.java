/**
 *
 */
package it.uiip.airport.core.dao;

import it.uiip.airport.core.model.TicketModel;

import java.util.List;


/**
 * @author pasop
 *
 */
public interface TicketsDao
{
	TicketModel findTicketsByFlight(String code, String passport);
	List<TicketModel> findTicketsListByFlight(final String code);
}
