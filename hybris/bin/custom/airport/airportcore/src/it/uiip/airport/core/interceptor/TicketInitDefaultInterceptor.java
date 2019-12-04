/**
 *
 */
package it.uiip.airport.core.interceptor;

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
 * @author sdeli
 *
 */
public class TicketInitDefaultInterceptor implements InitDefaultsInterceptor<TicketModel>
{
	@Resource
	private EventService eventService;
	private TicketEvent ticketEvent;



	@Override
	public void onInitDefaults(final TicketModel arg0, final InterceptorContext arg1) throws InterceptorException
	{

		ticketEvent.setCode(RandomStringUtils.randomAlphanumeric(3));
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
	@Required
	public void setTicketEvent(final TicketEvent ticketEvent)
	{
		this.ticketEvent = ticketEvent;
	}

}
