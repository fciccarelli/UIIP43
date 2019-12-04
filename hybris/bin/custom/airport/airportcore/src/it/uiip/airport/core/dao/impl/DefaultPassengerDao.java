
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
 * @author sdeli
 *
 */
public class DefaultPassengerDao extends DefaultGenericDao<PassengerModel> implements PassengerDao
{


	public DefaultPassengerDao()
	{
		super(PassengerModel._TYPECODE);

	}

	@Override
	public List<PassengerModel> findPassengersByCodeFlight(final String code)
	{
		final String queryStr = "SELECT {p.pk},{p.name},{p.surname},{t.code},{t.numberSeat} FROM {Flight as f JOIN Ticket as t on {f.pk } = {t.flight } JOIN Passenger as p  on {p.pk } = {t.passenger }} where {f.code}=?code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengers = result.getResult();

		return passengers;
	}

	@Override
	public List<PassengerModel> findPassengersByCodeTicket(final String code)
	{

		final String queryStr = "SELECT {p.pk},{p.name},{p.surname},{f.code} FROM {Flight as f JOIN Ticket as t on {f.pk } = {t.flight } JOIN Flight2PassengerRelation as fp on {fp.source} ={f.pk} JOIN Passenger as p  on {p.pk } = {fp.target}} where {t.code}?=code";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("code", code);
		final SearchResult<PassengerModel> result = getFlexibleSearchService().search(fsq);
		final List<PassengerModel> passengers = result.getResult();

		return passengers;
	}




}
