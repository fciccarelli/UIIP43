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


/**
 * @author fabiosessa
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{

	/**
	 * @param typecode
	 */
	public DefaultPassengerDao()
	{
		super(PassengerModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<PassengerModel> findPassengerByCode(final String code)
	{
		// XXX Auto-generated method stub
		final String queryStr = "SELECT {p.PK},{p.name},{p.surname},{t.code},{t.numberSeat} FROM { Flight as f Join Ticket as t ON {t.flight} = {f.pk} Join Passenger as p ON {p.pk} = {t.passengers}} where {f.code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passenger = result.getResult();
		return passenger;
	}

	@Override
	public List<PassengerModel> findPassenger(final String code)
	{
		// XXX Auto-generated method stub
		final String queryStr = "SELECT {p.PK} FROM {Passenger as p Join Flight as f ON {p.PK}= {f.PK}} where {f.code=?code}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passenger = result.getResult();
		return passenger;
	}



}
