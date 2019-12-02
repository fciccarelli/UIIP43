/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import it.uiip.airport.core.dao.FlightDao;
import it.uiip.airport.core.model.FlightModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultFlightDao extends DefaultGenericDao<FlightModel> implements FlightDao
{

	/**
	 * @param typecode
	 */
	public DefaultFlightDao()
	{
		super(FlightModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}

	@Override
	public FlightModel findFlightByCode(final String code)
	{
		// XXX Auto-generated method stub
		final String queryStr = "SELECT {p.name},{p.surname},{t.code},{t.numberSeat} FROM { Flight as f Join Ticket as t ON {t.flight} = {f.pk} Join Passenger as p ON {p.pk} = {t.passengers}} where {f.code} =?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<FlightModel> result = getFlexibleSearchService().search(fsq);
		final FlightModel flight = (FlightModel) result.getResult();
		return flight;
	}

}
