/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import bootstrap.gensrc.it.uiip.airport.core.model.AirportModel;



/**
 * @author ASUS
 *
 */

public interface AirportDao extends GenericDao<AirportModel>
{
	AirportModel findAirportByCode(String code);

}