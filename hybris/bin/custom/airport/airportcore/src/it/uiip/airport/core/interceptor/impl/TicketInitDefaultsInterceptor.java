/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import javax.annotation.Resource;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author SimonaBranca
 *
 */
public class TicketInitDefaultsInterceptor implements InitDefaultsInterceptor<TicketModel>
{

	@Resource
	private EventService eventService;
	private TicketEvent ticketEvent;


	@Override
	public void onInitDefaults(final TicketModel ticketModel, final InterceptorContext ctx) throws InterceptorException
	{


		ticketEvent.setCode(generateTicketCode(ticketModel));
		eventService.publishEvent(ticketEvent);

	}

	private String generateTicketCode(final TicketModel ticket)
	{

		String code = "";

		if (ticket != null && ticket.getCode().isEmpty())
		{

			code = ticket.getCode();

		}
		else
		{

			code = RandomStringUtils.randomAlphabetic(3);
		}
		return code;
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
	@Required
	public void setTicketEvent(final TicketEvent ticketEvent)
	{
		this.ticketEvent = ticketEvent;
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
