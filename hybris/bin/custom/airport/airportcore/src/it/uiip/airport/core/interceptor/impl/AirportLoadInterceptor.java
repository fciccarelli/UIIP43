/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PassengerModel;


/**
 * @author pasop
 *
 */
public class AirportLoadInterceptor implements LoadInterceptor
{
	Logger log = LoggerFactory.getLogger(AirportLoadInterceptor.class);

	@Override
	public void onLoad(final Object arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (arg0 instanceof PassengerModel)
		{
			log.info("Passenger model list loaded {}", LocalTime.now());
		}
		if (arg0 instanceof FlightModel)
		{
			log.info("Flight model list loaded {}", LocalTime.now());
		}

	}

}
