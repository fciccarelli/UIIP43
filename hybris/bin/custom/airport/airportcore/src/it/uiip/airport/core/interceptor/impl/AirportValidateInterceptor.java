/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author SimonaBranca
 *
 */
public class AirportValidateInterceptor implements ValidateInterceptor
{

	@Override
	public void onValidate(final Object model, final InterceptorContext arg1) throws InterceptorException
	{

		if (model instanceof TicketModel)
		{

			if (((TicketModel) model).getNumberSeat() == null && ((TicketModel) model).getCode() == null)
			{
				throw new InterceptorException("Error: numberSeat and Code can't be null");
			}


		}


	}

}
