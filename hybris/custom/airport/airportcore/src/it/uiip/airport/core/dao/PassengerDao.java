/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author pasop
 *
 */
public interface PassengerDao<DefaultPassengerDao> extends GenericDao
{
	public List<PassengerModel> findPassengersByNameAndSurname(String name, String surname);

}
