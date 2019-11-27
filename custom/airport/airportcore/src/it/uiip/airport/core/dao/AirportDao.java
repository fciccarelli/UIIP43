/**
 *
 */
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.AirportModel;

/**
 * @author pasop
 *
 */
public interface AirportDao<DefaultAirportDao> extends GenericDao
{

	/**
	 *
	 * @param _code
	 * @return
	 */
	public AirportModel findAirportsByCode(final String code);

}
