/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.AirportModel;

/**
 * @author Utente
 *
 */

public interface AirportDao extends GenericDao<AirportModel>
{
	AirportModel findAirportbyCode(String code);
}







