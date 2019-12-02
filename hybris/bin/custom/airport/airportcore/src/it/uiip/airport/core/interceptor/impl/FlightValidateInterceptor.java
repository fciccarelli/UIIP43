/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author SimonaBranca
 *
 */
public class FlightValidateInterceptor implements ValidateInterceptor<FlightModel>
{

	@Override
	public void onValidate(final FlightModel flightModel, final InterceptorContext ctx) throws InterceptorException
	{

		final String codeFlightModel = flightModel.getCode();

		if (codeFlightModel == null)
		{
			throw new InterceptorException("Error: code can't be null");
		}
		else if (codeFlightModel.length() != 12)
		{
			throw new InterceptorException("Error: code can't have a lenght equals to 12");
		}



	}

}
