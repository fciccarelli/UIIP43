/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;



/**
 * @author fabiosessa
 *
 */
public interface TicketsDao extends GenericDao<TicketModel>
{
	public TicketModel findTicketByCode(String code);

	public List<PassengerModel> findPassengerByCode(String code);
}
