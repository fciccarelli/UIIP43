/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author sdeli
 *
 */
public class FlightPrepareInterceptor implements PrepareInterceptor<FlightModel>
{

	private final Logger log = LoggerFactory.getLogger(FlightPrepareInterceptor.class);

	@Override
	public void onPrepare(final FlightModel flight, final InterceptorContext arg1) throws InterceptorException
	{


		String prova = flight.getCode().replaceAll("\\s", "");
		//prova = prova.trim();
			if (prova.length() > 12)
			{
				prova = prova.substring(0, 12);
				flight.setCode(prova);

			}
		flight.setCode(prova);
			log.info("Changed format of code", flight.getCode());
		}


}
