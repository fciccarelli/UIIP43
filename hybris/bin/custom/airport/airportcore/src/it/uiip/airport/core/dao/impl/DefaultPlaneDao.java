/**
 *
 */
package it.uiip.airport.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;


/**
 * @author pasop
 *
 */
public class DefaultPlaneDao extends DefaultGenericDao<PlaneModel> implements PlaneDao
{

	public DefaultPlaneDao()
	{
		super(PlaneModel._TYPECODE);
	}

	@Override
	public List<PlaneModel> findAllPlanes()
	{
		final String query = "SELECT {PK} FROM {Plane}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<PlaneModel> result = getFlexibleSearchService().search(fsq);
		final List<PlaneModel> planeModels = result.getResult();
		return planeModels;
	}



}
