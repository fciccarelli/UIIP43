/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public class TicketZInitDefaultsInterceptor implements InitDefaultsInterceptor<TicketModel>
{

	private final Logger log = LoggerFactory.getLogger(TicketZPrepareInterceptor.class);

	@Override
	public void onInitDefaults(final TicketModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (var1 instanceof TicketModel)
		{

			checkDateTicket(var1);

		}
	}

	private void checkDateTicket(final TicketModel ticket)
	{

		final Date localDate = new Date();

		if (ticket.getCurrentDate().equals(localDate))
		{

			log.info("La Data è uguale", ticket.getCurrentDate());

		}
		log.info("La Data non è uguale", ticket.getCurrentDate());

	}

}
