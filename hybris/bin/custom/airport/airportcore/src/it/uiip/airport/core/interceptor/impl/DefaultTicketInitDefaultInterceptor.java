/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultTicketInitDefaultInterceptor implements InitDefaultsInterceptor<TicketModel>
{
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
	 * @param eventService
	 *           the eventService to set
	 */
	@Required
	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;

	}


	@Override
	public void onInitDefaults(final TicketModel ticket, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub


		ticketEvent.setCode(genarateTicketCode(ticket));
		eventService.publishEvent(ticketEvent);


	}

	private String genarateTicketCode(final TicketModel ticket)
	{
		final String code;
		if (ticket != null && ticket.getCode() != null)
		{
			code = ticket.getCode();
		}
		else
		{
			code = RandomStringUtils.random(3);
		}
		return code;

	}





}
