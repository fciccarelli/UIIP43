/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author pasop
 *
 */
public class FlightPrepareInterceptor implements PrepareInterceptor<FlightModel>
{

	Logger log = LoggerFactory.getLogger(FlightPrepareInterceptor.class);

	public static final int MAX_LENGTH_CODE = 12;

	@Override
	public void onPrepare(final FlightModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (var1 instanceof FlightModel)
		{
			var1.setCode(trim(var1.getCode()));
		}
		log.info("The code has been set to {}", var1.getCode());

	}

	private String trim(final String code)
	{
		final String codeTrimmed = code.replaceAll("\\s", "");
		if (codeTrimmed.length() > MAX_LENGTH_CODE)
		{
			return codeTrimmed.substring(0, MAX_LENGTH_CODE);
		}
		else
		{
			return codeTrimmed;
		}
	}

}
