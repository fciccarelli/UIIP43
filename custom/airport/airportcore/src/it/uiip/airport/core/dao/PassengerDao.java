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
	List<PassengerModel> findPassengerbynamesurname(String name, String surname);
}
