/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author Luigi
 *
 */
public class TicketInitDefaultsInterceptor implements InitDefaultsInterceptor<TicketModel>
{

	private EventService eventService;

	@Override
	public void onInitDefaults(final TicketModel ticket, final InterceptorContext arg1) throws InterceptorException
	{


	}

	/**
	 * @return the eventService
	 */
	public EventService getEventService()
	{
		return eventService;
	}

	/**
	 * @param eventService
	 *           the eventService to set
	 */
	@Required
	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;
	}



}
