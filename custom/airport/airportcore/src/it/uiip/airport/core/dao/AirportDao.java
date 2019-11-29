/**
 *
 */
package it.uiip.airport.core.dao;


import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.model.AirportModel;


/**
 * @author ASUS
 *
 */
public interface AirportDao extends GenericDao<AirportModel>
{

	public AirportModel findAirportByCode(final String code);


	//	List<Airport> findAll();
	//
	//List<Airport> findById();
	//
	//	List<Airport> findByName();
	//
	//	boolean insertAirport(Airport airport);
	//
	//	boolean updateAirport(Airport airport);
	//
	//	boolean deleteAirport(Airport airport);



}

