/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author SimonaBranca
 *
 */
public class TicketRemoveInterceptor implements RemoveInterceptor<TicketModel>
{

	@Resource
	private EventService eventService;
	private TicketEvent ticketEvent;

	@Override
	public void onRemove(final TicketModel ticketModel, final InterceptorContext ctx) throws InterceptorException
	{

		ticketEvent.setCode(ticketModel.getCode());
		eventService.publishEvent(ticketEvent);

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


	/**
	 * @return the ticketEvent
	 */
	public TicketEvent getTicketEvent()
	{
		return ticketEvent;
	}


	/**
	 * @param ticketEvent
	 *           the ticketEvent to set
	 */
	public void setTicketEvent(final TicketEvent ticketEvent)
	{
		this.ticketEvent = ticketEvent;
	}



}
