/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author soprasteria
 *
 */
public class TicketRemoveInterceptor  implements RemoveInterceptor
{
private EventService eventService;



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
{
		//

}



}




