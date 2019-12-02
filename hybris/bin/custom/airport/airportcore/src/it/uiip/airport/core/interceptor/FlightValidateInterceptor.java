/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author aDeAngelis
 *
 */
public class FlightValidateInterceptor  implements ValidateInterceptor<FlightModel>
{

	@Override
	public void onValidate(final FlightModel flight, final InterceptorContext ctx) throws InterceptorException
	{
		//final String codeFlight = flight.getCode();

		if (flight == null)
		{
			throw new InterceptorException("");
		}
		else if (flight.getCode().length() != 12)
		{
			throw new InterceptorException("Code has a length different from 12");
		}
	}



	}


