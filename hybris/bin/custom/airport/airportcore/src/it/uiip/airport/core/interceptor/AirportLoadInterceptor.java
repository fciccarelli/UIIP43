/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.AirportModel;


/**
 * @author ASUS
 *
 */
public class AirportLoadInterceptor implements LoadInterceptor
{
	private final Logger log = LoggerFactory.getLogger(AirportPrepareInterceptor.class);

	@Override
	public void onLoad(final Object var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (var1 instanceof AirportModel)
		{
			log.info("I'm loading");
		}
	}

}
