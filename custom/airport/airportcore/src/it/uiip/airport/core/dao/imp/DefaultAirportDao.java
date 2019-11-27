/**
 *
 */
package it.uiip.airport.core.dao.imp;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;


/**
 * @author Luigi
 *
 */
public class DefaultAirportDao extends DefaultGenericDao<AirportModel> implements AirportDao
{

	public DefaultAirportDao()
	{
		super(AirportModel._TYPECODE);
	}

	public DefaultAirportDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public AirportModel findAirportByCode(final String typecode)
	{
		final String queryStr = "SELECT {PK} FROM {Airport} WHERE {code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult<AirportModel> result = getFlexibleSearchService().search(fsq);
		final AirportModel airport = (AirportModel) result.getResult();
		return airport;
	}

}
