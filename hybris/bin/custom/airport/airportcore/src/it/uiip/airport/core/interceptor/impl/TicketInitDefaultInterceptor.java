/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author pasop
 *
 */
public class TicketInitDefaultInterceptor implements InitDefaultsInterceptor<TicketModel>
{

	private EventService eventService;
	private TicketEvent ticketEvent;

	@Override
	public void onInitDefaults(final TicketModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		eventService.publishEvent(ticketEvent);
	}

	public EventService getEventService() {
		return eventService;
	}

	@Required
	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	public TicketEvent getTicketEvent() {
		return ticketEvent;
	}

	@Required
	public void setTicketEvent(TicketEvent ticketEvent) {
		this.ticketEvent = ticketEvent;
	}
}
