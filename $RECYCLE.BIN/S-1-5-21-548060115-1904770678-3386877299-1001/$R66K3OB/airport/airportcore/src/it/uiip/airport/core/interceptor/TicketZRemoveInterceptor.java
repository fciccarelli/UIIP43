/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public class TicketZRemoveInterceptor implements RemoveInterceptor<TicketModel>
{

	@Override
	public void onRemove(final TicketModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (var1 == null)
		{
			throw new InterceptorException("Il TicketModel è nullo!");
		}
	}

}
