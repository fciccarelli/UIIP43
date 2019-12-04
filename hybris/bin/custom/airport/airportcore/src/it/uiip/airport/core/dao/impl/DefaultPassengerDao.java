
/**
 *
 */
package it.uiip.airport.core.dao.impl;


import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import javax.naming.directory.SearchResult;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author asus
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{


	public DefaultPassengerDao()
	{
		super(PassengerModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<PassengerModel> findPassengerByNameSurname(final String name, final String surname)
	{
		final String queryStr = "SELECT {PK} FROM {Passenger} WHERE {name}=?name AND {surname}=?surname";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("name", name);
		fsq.addQueryParameter("surname", surname);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengers = result.getResult();

		return passengers;
	}

	public List<PassengerModel> listPassengerEventTicketRemoved(final TicketModel ticket)
	{

		final String queryStr = "select {PK} from {Passenger} as p join{ {Flight} as f on {p.pk}={f.pk}} join {{Ticket} as t on {f.pk}={tcode} }where {code} = ?ticketcode";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("ticket", ticket);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> tickets = result.getResult();

		return tickets;
	}


}
