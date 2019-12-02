/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author SimonaBranca
 *
 */
public class AirportLoadInterceptor implements LoadInterceptor
{
	private final Logger log = LoggerFactory.getLogger(AirportLoadInterceptor.class);

	@Override
	public void onLoad(final Object model, final InterceptorContext ctx) throws InterceptorException
	{

		if (model instanceof TicketModel)
		{
			log.info("Loading Passenger");

		}
	}
}
