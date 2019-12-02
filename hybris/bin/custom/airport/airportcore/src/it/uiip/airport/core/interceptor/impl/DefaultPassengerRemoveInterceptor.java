/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultPassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel>
{

	@Override
	public void onRemove(final PassengerModel pass, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (pass != null)
		{

		}
		else
		{
			throw new InterceptorException("passenger is null");
		}
	}

}
