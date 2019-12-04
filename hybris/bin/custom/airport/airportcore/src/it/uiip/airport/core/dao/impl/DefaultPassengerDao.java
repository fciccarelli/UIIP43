
/**
 *
 */
package it.uiip.airport.core.dao.impl;


import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import net.sourceforge.pmd.lang.java.symboltable.Search;


/**
 * @author sdeli
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

	@Override
	public List<PassengerModel> findPassengersByFlight(final String code)
	{
		final String queryStr = "SELECT {p.PK} FROM {Flight as f "
				+ "	JOIN Ticket as t 	" + "	ON {t.flight} = {f.PK} "

				+ "	JOIN Passenger as p " + "	ON {t.passenger} = {p.PK} "

				+ "}  WHERE {f.code}=?code" ;

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		return result.getResult();

	}

	@Override
	public List<PassengerModel> findPassengersByTicket(final String ticketCode){
			final String query = "SELECT {p.PK} FROM { Ticket as t \n" +

					"                    JOIN Flight as f  ON {t.flight} = {f.PK}\n" +
					"                    \n" +
					"                    JOIN Flight2PassengerRelation as f2p \n" +
					"                    ON {f2p.source} = {f.PK}\n" +
					"                    \n" +
					"                    JOIN Passenger as p \n" +
					"                    ON {f2p.target} = {p.PK}\n" +
					"                    \n" +
					"                    } WHERE  {t.code} =?ticketCode";

			final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
			fsq.addQueryParameter("ticketCode", ticketCode);
			final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
			return result.getResult();

	}

}
