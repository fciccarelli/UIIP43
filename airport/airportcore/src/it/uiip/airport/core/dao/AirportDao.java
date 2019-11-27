/**
 *
 */
package it.uiip.airport.core.dao;


import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.AirportModel;

/**
 * @author SimonaBranca
 *
 */
public interface AirportDao extends GenericDao<AirportModel>
{

	public AirportModel findAirportByCode(String code);

}
