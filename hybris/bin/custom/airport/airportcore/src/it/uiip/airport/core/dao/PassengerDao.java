/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import bootstrap.gensrc.it.uiip.airport.core.model.PassengerModel;


/**
 * @author asus
 *
 */
public interface PassengerDao extends GenericDao<PassengerModel>
{
	List<PassengerModel> findPassengerByNameSurname(String name, String surname);
}
