/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author pasop
 *
 */
public interface TicketDao
{
	List<TicketModel> findAllTickets();
}
