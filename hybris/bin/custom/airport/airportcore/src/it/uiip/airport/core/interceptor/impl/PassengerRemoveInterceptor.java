/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author SimonaBranca
 *
 */
public class PassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel>
{

	@Override
	public void onRemove(final PassengerModel passengerModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (passengerModel == null)
		{
			throw new InterceptorException("Passenger can't be null");
		}

	}

}
