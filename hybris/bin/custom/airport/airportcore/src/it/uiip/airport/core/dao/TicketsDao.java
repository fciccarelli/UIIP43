/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author SimonaBranca
 *
 */
public interface TicketsDao extends GenericDao<TicketModel>
{

	List<TicketModel> findTicketsByCodeFlight(String code);
}
