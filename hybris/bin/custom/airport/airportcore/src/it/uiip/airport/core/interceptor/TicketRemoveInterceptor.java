/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author Luigi
 *
 */
public class TicketRemoveInterceptor implements RemoveInterceptor<TicketModel>
{

	private EventService eventService;

	@Override
	public void onRemove(final TicketModel ticket, final InterceptorContext arg1) throws InterceptorException
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
