/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultAirportValidateInterceptor implements ValidateInterceptor
{

	@Override
	public void onValidate(final Object model, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		validateFieldsTicket(model);

	}

	private boolean validateFieldsTicket(final Object tick) throws InterceptorException
	{
		boolean isOk = false;
		if (tick instanceof TicketModel)
		{
			if (((TicketModel) tick).getCode() != null && ((TicketModel) tick).getNumberSeat() != null)
			{

				isOk = true;
			}
			else
			{
				throw new InterceptorException("Code and numberSeat are null");
			}
		}
		return isOk;



	}

}
