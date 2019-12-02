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
	public void onValidate(final Object model, final InterceptorContext arg1) throws InterceptorException
	{

		final TicketModel ticketModel = (TicketModel) model;

		if (model instanceof TicketModel)
		{
			if (ticketModel.getCode() == null)
			{
				throw new InterceptorException("Code cannot be null.");
			}
			if (ticketModel.getNumberSeat() == null)
			{
				throw new InterceptorException("NumberSeat cannot be null.");
			}
		}

	}

}
