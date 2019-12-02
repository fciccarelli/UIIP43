/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author aDeAngelis
 *
 */
public class AirportValidateInterceptor implements ValidateInterceptor
{

	@Override
	public void onValidate(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (model instanceof TicketModel)
		{

			if (((TicketModel) model).getCode() == null && ((TicketModel) model).getNumberSeat() == null)

			{
				throw new InterceptorException("can't be null");
			}
		}
	}

}
