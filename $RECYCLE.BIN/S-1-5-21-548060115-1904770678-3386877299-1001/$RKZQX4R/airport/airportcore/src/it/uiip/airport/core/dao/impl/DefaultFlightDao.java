/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;

/**
 * @author pasop
 *
 */
public class DefaultFlightDao extends DefaultGenericDao<FlightModel> implements FlightDao
{

	public DefaultFlightDao()
	{
		super(FlightModel._TYPECODE);
	}

	@Override
	public List<FlightModel> findAllFlights()
	{
		final String query = "SELECT {PK} FROM {Flight}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);

		final SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		final List<FlightModel> flightModels = result.getResult();
		return flightModels;

	}

}
