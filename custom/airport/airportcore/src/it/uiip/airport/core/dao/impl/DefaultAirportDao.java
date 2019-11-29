/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import javax.naming.directory.SearchResult;

import it.uiip.airport.core.dao.AirportDao;
import it.uiip.airport.core.model.AirportModel;


/**
 * @author ASUS
 *
 */
public class DefaultAirportDao extends DefaultGenericDao<AirportModel> implements AirportDao
{


	public DefaultAirportDao()
	{

		super(AirportModel._TYPECODE);
	}

	/**
	 * @param typecode
	 */
	public DefaultAirportDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public AirportModel findAirportByCode(final String code)
	{
		final String queryStr = "SELECT {PK} FROM {Airport} WHERE {code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final SearchResult result = (SearchResult) getFlexibleSearchService().search(fsq);
		final AirportModel airport = (AirportModel) ((de.hybris.platform.servicelayer.search.SearchResult<Object>) result)
				.getResult();
		return airport;
	}



}
