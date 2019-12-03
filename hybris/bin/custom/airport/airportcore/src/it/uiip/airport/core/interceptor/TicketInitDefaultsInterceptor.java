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

import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;


/**
 * @author soprasteria
 *
 */
public class TicketInitDefaultsInterceptor implements InitDefaultsInterceptor<TicketModel>
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
	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;
	}




}
