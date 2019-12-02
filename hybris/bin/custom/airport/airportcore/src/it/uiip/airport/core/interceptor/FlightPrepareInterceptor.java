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
 * @author Luigi
 *
 */
public class FlightPrepareInterceptor implements PrepareInterceptor<FlightModel>
{

	private final Logger log = LoggerFactory.getLogger(PassengerPrepareInterceptor.class);

	@Override
	public void onPrepare(final FlightModel flight, final InterceptorContext arg1) throws InterceptorException
	{

		if (flight != null)
		{
			String newCode = "";
			String ultimateCode = "";
			newCode = flight.getCode().replaceAll("\\s", "");
			if (newCode.length() > 12)
			{
				ultimateCode = newCode.substring(0, 12);
				flight.setCode(ultimateCode);
			}
			else
			{
				flight.setCode(newCode);
			}
		}
		log.info("Changed Code string to 12 character without spaces", flight);

	}

}
