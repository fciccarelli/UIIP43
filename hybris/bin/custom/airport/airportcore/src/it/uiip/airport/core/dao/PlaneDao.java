/**
 *
 */
package it.uiip.airport.core.dao;

import java.util.List;

import it.uiip.airport.core.model.PlaneModel;


/**
 * @author pasop
 *
 */
public interface PlaneDao
{
	List<PlaneModel> findAllPlanes();
}
