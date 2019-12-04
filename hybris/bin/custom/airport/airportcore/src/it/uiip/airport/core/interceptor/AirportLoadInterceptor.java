/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author sdeli
 *
 */
public class AirportLoadInterceptor implements LoadInterceptor
{
	private final Logger log = LoggerFactory.getLogger(AirportLoadInterceptor.class);

	@Override
	public void onLoad(final Object var1, final InterceptorContext var2) throws InterceptorException
	{
		if (var1 instanceof TicketModel)
		{
			// XXX Auto-generated method stub
			log.info("Sto caricando");
		}

	}

}
