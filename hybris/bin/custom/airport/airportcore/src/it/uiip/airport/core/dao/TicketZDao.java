/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import bootstrap.gensrc.it.uiip.airport.core.model.TicketModel;


/**
 * @author asus
 *
 */
public interface TicketZDao extends GenericDao<TicketModel>
{
	List<TicketModel> findTicketByCodeFlight(String code);
}
