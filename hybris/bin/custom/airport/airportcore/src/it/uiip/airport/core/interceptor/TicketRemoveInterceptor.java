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

import it.uiip.airport.core.event.TicketEvent;

/**
 * @author soprasteria
 *
 */
public class TicketRemoveInterceptor  implements RemoveInterceptor
{
	@Resource
   private EventService eventService;
	private TicketEvent ticketEvent;


/**
 * @return the eventService
 */
public EventService getEventService()
{
	return eventService;
}

/**
 * @param eventService the eventService to set
 */
@Required
public void setEventService(final EventService eventService)
{
	this.eventService = eventService;
}

@Override
public void onRemove(final Object arg0, final InterceptorContext arg1) throws InterceptorException
	{ //ticketEvent.setCode();
      ticketEvent.setCode(generateTicketCode(arg0));
	   eventService.publishEvent(ticketEvent);

}

	/**
	 * @param arg0
	 * @return
	 */
	private String generateTicketCode(final Object arg0)
	{
		// XXX Auto-generated method stub
		return null;
}

}





