/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public interface TicketDao extends GenericDao<TicketModel>
{
	TicketModel findTicketByCode(String code);
}
