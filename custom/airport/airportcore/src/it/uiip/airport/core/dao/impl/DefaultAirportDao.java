/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;


/**
 * @author pasop
 *
 */
public class DefaultAirportDao extends DefaultGenericDao implements AirportDao
{

	/**
	 * @param typecode
	 */
	private DefaultAirportDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public AirportModel findAirportsByCode(final String code)
	{

		final String query = "SELECT {" + AirportModel.CODE + "} FROM {" + AirportModel._TYPECODE + "} WHERE {" + AirportModel.CODE
				+ "} = ?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.addQueryParameter("code", code);

		final AirportModel result = (AirportModel) getFlexibleSearchService().search(fsq);

		return result;
	}

}
