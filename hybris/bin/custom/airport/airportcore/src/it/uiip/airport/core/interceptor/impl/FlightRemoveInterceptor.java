/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author pasop
 *
 */
public class FlightRemoveInterceptor implements RemoveInterceptor<FlightModel>
{

	@Override
	public void onRemove(final FlightModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (var1 == null)
		{
			throw new InterceptorException("FlightModel is null");
		}
	}

}
