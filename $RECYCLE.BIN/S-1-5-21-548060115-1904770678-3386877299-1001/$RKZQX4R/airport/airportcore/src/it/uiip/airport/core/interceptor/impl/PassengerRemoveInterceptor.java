/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author pasop
 *
 */
public class PassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel>
{

	@Override
	public void onRemove(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (arg0 == null)
		{
			throw new InterceptorException("The passenger model is null");

		}
	}

}
