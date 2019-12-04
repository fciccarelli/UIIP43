/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultTicketRemoveInterceptor implements RemoveInterceptor<TicketModel>
{
	private TicketEvent ticketEvent;
	private EventService eventService;

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

	@Override
	public void onRemove(final TicketModel tick, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub

		ticketEvent.setCode(tick.getCode());
		eventService.publishEvent(ticketEvent);
	}

}
