/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Luigi
 *
 */
public class AirportLoadInterceptor implements LoadInterceptor
{

	private final Logger log = LoggerFactory.getLogger(PassengerPrepareInterceptor.class);

	@Override
	public void onLoad(final Object arg0, final InterceptorContext arg1) throws InterceptorException
	{
		log.info("Uploading Passenger");
	}


}
