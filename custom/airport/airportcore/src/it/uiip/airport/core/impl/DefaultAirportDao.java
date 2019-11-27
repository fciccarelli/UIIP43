/**
 *
 */
package it.uiip.airport.core.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

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
	public AirportModel findAirportbyCode(final String code)
	{

		final String queryStr = "SELECT {PK} FROM {Airport} WHERE {code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final AirportModel airport = (AirportModel) getFlexibleSearchService().search(fsq);

		return airport;
	}




}
