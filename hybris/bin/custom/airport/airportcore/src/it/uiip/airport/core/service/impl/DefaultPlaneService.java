/**
 *
 */
package it.uiip.airport.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.dao.PlaneDao;
import it.uiip.airport.core.model.PlaneModel;
import it.uiip.airport.core.service.PlaneService;


/**
 * @author pasop
 *
 */
public class DefaultPlaneService implements PlaneService
{

	PlaneDao planeDao;

	@Override
	public List<PlaneModel> getAllPlanes()
	{
		return planeDao.findAllPlanes();
	}

	/**
	 * @return the planeDao
	 */
	public PlaneDao getPlaneDao()
	{
		return planeDao;
	}

	/**
	 * @param planeDao
	 *           the planeDao to set
	 */
	@Required
	public void setPlaneDao(final PlaneDao planeDao)
	{
		this.planeDao = planeDao;
	}

}
