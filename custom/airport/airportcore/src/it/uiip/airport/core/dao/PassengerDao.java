
package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import it.uiip.airport.core.jalo.Passenger;
import it.uiip.airport.core.model.PassengerModel;


/**
 * @author ASUS
 *
 */
public interface PassengerDao extends GenericDao<PassengerModel>
{

	public PassengerModel findByNameSurname(Passenger nome, Passenger cognome);

	//public AirportModel findAirportByCode(final String code);
}
