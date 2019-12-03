/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import it.uiip.airport.core.model.TicketModel;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author pasop
 *
 */
public class TicketRemoveInterceptor implements RemoveInterceptor<TicketModel>
{

	private EventService eventService;

	@Override
	public void onRemove(final TicketModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub

	}

	public EventService getEventService() {
		return eventService;
	}

	@Required
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}
}
