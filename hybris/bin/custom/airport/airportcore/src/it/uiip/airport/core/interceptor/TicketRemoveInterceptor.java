/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author sdeli
 *
 */
public class TicketRemoveInterceptor implements RemoveInterceptor<TicketModel>
{
	@Resource
	private EventService eventService;

	@Override
	public void onRemove(final TicketModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// TicketRemoveInterceptor

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
