/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author sdeli
 *
 */
public interface PassengerDao extends GenericDao<PassengerModel>
{
	List<PassengerModel> findPassengerByNameSurname(final String name, final String surname);

	List<PassengerModel> findPassengersByFlight(final String code);

	List<PassengerModel> findPassengersByTicket(final String ticketCode);
}
