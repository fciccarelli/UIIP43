/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author sdeli
 *
 */
public class TicketRemoveInterceptor implements RemoveInterceptor<TicketModel>
{

	@Override
	public void onRemove(final TicketModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub

	}

}
