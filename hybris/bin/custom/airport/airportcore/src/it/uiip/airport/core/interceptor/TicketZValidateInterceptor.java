/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public class TicketZValidateInterceptor implements ValidateInterceptor
{

	@Override
	public void onValidate(final Object model, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (model instanceof TicketModel)
		{
			final TicketModel tick = (TicketModel) model;
			if (tick.getCode() == null)
			{
				throw new InterceptorException("Code cannot be null");
			}
			if (tick.getNumberSeat() == null)
			{
				throw new InterceptorException("numberSeat cannot be null");
			}
		}
	}

}
