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
 * @author ASUS
 *
 */
public class TicketZLoadInterceptor implements LoadInterceptor
{

	private final Logger log = LoggerFactory.getLogger(TicketZPrepareInterceptor.class);

	@Override
	public void onLoad(final Object var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		log.info("I'm loading");
	}

}
