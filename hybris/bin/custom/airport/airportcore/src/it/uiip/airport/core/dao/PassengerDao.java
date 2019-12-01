/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public interface PassengerDao extends GenericDao<PassengerModel>
{
	public PassengerModel findPassengerByCode(String code);
}
