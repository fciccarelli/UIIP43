/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author sdeli
 *
 */
public class FlightValidateInterceptor implements ValidateInterceptor<FlightModel>
{

	@Override
	public void onValidate(final FlightModel flight, final InterceptorContext arg1) throws InterceptorException
	{


			if (flight == null)
			{
				throw new InterceptorException("Code cannot be null");
			}
			else if (flight.getCode().length() != 12)
			{

				throw new InterceptorException("Code have a diffenter lenght of 12");
			}
		}





}
