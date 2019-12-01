/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author ASUS
 *
 */
public interface FlightDao extends GenericDao<FlightModel>
{
	FlightModel findFlightByCode(String code);
}
