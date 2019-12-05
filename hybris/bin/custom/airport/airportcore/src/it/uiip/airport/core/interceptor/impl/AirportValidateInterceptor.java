/**
 *
 */

package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;



/**
 * @author pasop
 *
 */

public class AirportValidateInterceptor implements ValidateInterceptor
{
	Logger log = LoggerFactory.getLogger(AirportValidateInterceptor.class);

	@Override
	public void onValidate(final Object arg0, final InterceptorContext arg1) throws InterceptorException
	{

		// XXX Auto-generated method stub
		if (arg0 instanceof TicketModel)
		{
			final TicketModel tm = (TicketModel) arg0;
			if (tm.getCode() == null)
			{
				throw new InterceptorException("The code is null");
			}
			if (tm.getNumberSeat() == null)
			{
				throw new InterceptorException("The number of seat is null");
			}
		}

		if (arg0 instanceof PassengerModel)
		{
			final PassengerModel pm = (PassengerModel) arg0;
			if (pm.getUid() == null)
			{
				throw new InterceptorException("The uid is null");
			}
			if (pm.getName() == null)
			{
				throw new InterceptorException("The name is null");
			}
			if (pm.getSurname() == null)
			{
				throw new InterceptorException("The surname is null");
			}
			if (pm.getPassport() == null)
			{
				throw new InterceptorException("The passport is null");
			}

		}

		if (arg0 instanceof FlightModel)
		{

			final FlightModel fm = (FlightModel) arg0;
			if (fm.getCode() == null)
			{
				throw new InterceptorException("code is null");
			}

	//	else if (fm.getCode().length() != 12)
	//		{
		//		throw new InterceptorException("The code has length different from 12");
		//	}

			if (fm.getDayWeek() == null)
			{
				throw new InterceptorException("dayWeek is null");
			}
			if (fm.getDepartureTime() == null)
			{
				throw new InterceptorException("departureTime is null");
			}
			if (fm.getArrivalAirport() == null)
			{
				throw new InterceptorException("arrivalTime is null");
			}
		}

	}

}

