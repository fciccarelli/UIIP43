/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author aDeAngelis
 *
 */
public class PassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel>
{



	@Override
	public void onRemove(final PassengerModel passengerModel, final InterceptorContext arg1) throws InterceptorException
	{
		if (passengerModel == null)
		{



			throw new InterceptorException("passenger model is null");
		}

	}


}
