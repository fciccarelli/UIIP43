/**
 *
 */
package it.uiip.airport.core.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;


/**
 * @author aDeAngelis
 *
 */
public class DefaultAirportDao extends DefaultGenericDao<AirportModel> implements AirportDao
{
	/**
	 * @param typecode
	 */

	public DefaultAirportDao()
	{
		super(AirportModel._TYPECODE);
	}



	@Override
	public AirportModel findAirportbyCode(final String code)
	{
		final	String queryStr = "SELECT{PK} FROM{Car} WHERE {code} = ?code";
			final FlexibleSearchQuery fsq= new FlexibleSearchQuery(queryStr );
			fsq.addQueryParameter("code", code);
		final AirportModel airport = (AirportModel) getFlexibleSearchService().search(fsq);
		return airport;
	}
}
