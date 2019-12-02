/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.FlightModel;

/**
 * @author Luigi
 *
 */
public class FlightValidateInterceptor implements ValidateInterceptor
{

	@Override
	public void onValidate(final Object flight, final InterceptorContext arg1) throws InterceptorException
	{

		final FlightModel flightModel = (FlightModel) flight;

		if (flight instanceof FlightModel)
		{
			if (flightModel.getCode() == null)
			{
				throw new InterceptorException("Code cannot be null.");
			}
			else if (flightModel.getCode().length() != 12)
			{
				throw new InterceptorException("Code length cannot be different from 12 character.");
			}

		}

	}

}
