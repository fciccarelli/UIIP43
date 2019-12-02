/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author fabiosessa
 *
 */
public class DafaultFlightValidateInterceptor implements ValidateInterceptor
{
	Logger log = LoggerFactory.getLogger(DafaultFlightValidateInterceptor.class);
	@Override
	public void onValidate(final Object fli, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (fli instanceof FlightModel)
		{
			final FlightModel flight = (FlightModel) fli;
			if (flight.getCode() != null)
			{
				if (checkCode(flight.getCode()) == false)
				{
					throw new InterceptorException("code invalidate");
				}
				else
				{
					log.info("code validate");
				}
			}
			else
			{
				throw new InterceptorException("code flight is null");
			}
		}

	}

	private boolean checkCode(final String code)
	{
		boolean isOk = false;
		if (code.length() == 12)
		{
			isOk = true;
		}
		else
		{
			isOk = false;
		}
		return isOk;

	}

}
