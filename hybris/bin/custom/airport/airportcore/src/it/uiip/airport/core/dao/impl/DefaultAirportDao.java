/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;


/**
 * @author fabiosessa
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
		// XXX Auto-generated constructor stub
	}

	@Override
	public AirportModel findAirportByCode(final String code)
	{
		// XXX Auto-generated method stub
		final String queryStr = "Select {PK} from {Airport} where {code}= ?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code",code);
		final SearchResult<AirportModel> result = getFlexibleSearchService().search(fsq);
		final AirportModel airport = (AirportModel) result.getResult();
		return airport;

	}









}
