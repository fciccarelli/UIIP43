/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.core.model.FlightModel;


/**
 * @author ASUS
 *
 */
public class DefaultFlightDao extends DefaultGenericDao<FlightModel> implements FlightDao
{
	public DefaultFlightDao()
	{
		super(AirportModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}




	public FlightModel findFlightByCode(final String code)
	{

		final String queryStr = "SELECT {PK} FROM {Flight} WHERE {code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		final List<FlightModel> flights = result.getResult();

		return flights.get(0);
	}
}
