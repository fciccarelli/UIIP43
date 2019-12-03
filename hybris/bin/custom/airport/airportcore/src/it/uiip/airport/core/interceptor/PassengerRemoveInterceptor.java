/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author sdeli
 *
 */
public class PassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel>
{

	@Override
	public void onRemove(final PassengerModel var1, final InterceptorContext var2) throws InterceptorException
	{
		if (var1 == null)
		{
			throw new InterceptorException("Il PassengerModel è nullo!");
		}

	}


}
