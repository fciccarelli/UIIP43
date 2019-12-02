/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author fabiosessa
 *
 */
public class DafaultFlightPrepareInterceptor implements PrepareInterceptor
{

	@Override
	public void onPrepare(final Object fli, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (fli instanceof FlightModel)
		{
			final FlightModel flight = (FlightModel) fli;
			if (flight.getCode() != null)
			{
				final String code = flight.getCode();
				final String codeTrunc = trimCode(code);
				flight.setCode(codeTrunc);
			}
			else
			{
				throw new InterceptorException("code flight is null");
			}
		}



	}

	private String trimCode(final String code)
	{
		String codeTrunc = null;
		code.replaceAll("\\s", "");
				if (code.length() > 12)
				{
					codeTrunc = code.substring(0, 12);
				}
		return codeTrunc;
	}
}
