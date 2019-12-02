/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author Luigi
 *
 */
public class PassengerRemoveInterceptor implements RemoveInterceptor<PassengerModel>
{

	@Override
	public void onRemove(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{

		throw new InterceptorException("Interceptor Exception");

		//		if (arg0 != null)
		//		{
		//			System.out.println("Sto per rimuovere qualcosa");
		//		}
		//		else
		//		{
		//			throw new InterceptorException("Interceptor Exception");
		//		}

	}

}
