package it.uiip.airport.core.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import it.uiip.airport.core.model.PassengerModel;


public interface PassengerDao extends GenericDao<PassengerModel>
{

	public List<PassengerModel> findPassengerByNameSurname(String name, String surname);

}
