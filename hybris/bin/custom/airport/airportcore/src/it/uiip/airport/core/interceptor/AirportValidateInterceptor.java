/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author Luigi
 *
 */
public class AirportValidateInterceptor implements ValidateInterceptor
{

	@Override
	public void onValidate(final Object var1, final InterceptorContext var2) throws InterceptorException
	{
		if (var1 instanceof TicketModel)
		{
			final TicketModel tick = (TicketModel) var1;
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
