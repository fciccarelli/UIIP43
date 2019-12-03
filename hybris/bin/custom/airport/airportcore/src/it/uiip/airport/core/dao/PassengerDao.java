/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public interface PassengerDao extends GenericDao<PassengerModel>
{
	public List<PassengerModel> findPassengerByCode(String code);

	public List<PassengerModel> findPassenger(String code);
}
