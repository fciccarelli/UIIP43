/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;

/**
 * @author Utente
 *
 */
public interface PassengerDao extends GenericDao<PassengerModel>
{
	List<PassengerModel> findPassengertbynamesurname(String name, String surname);

	/**
	 * @param name
	 * @param surname
	 * @return
	 */



}
