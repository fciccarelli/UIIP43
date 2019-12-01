/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;


/**
 * @author sdeli
 *
 */
public class DefaultAirportDao extends DefaultGenericDao<AirportModel> implements AirportDao
{


	public DefaultAirportDao()
	{
		super(AirportModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}



	@Override
	public AirportModel findAirportByCode(final String code)
	{

		final String queryStr = "SELECT {PK} FROM {Airport} WHERE {code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<AirportModel> result = getFlexibleSearchService().search(fsq);
		final List<AirportModel> airports = result.getResult();

		return airports.get(0);
	}




}
