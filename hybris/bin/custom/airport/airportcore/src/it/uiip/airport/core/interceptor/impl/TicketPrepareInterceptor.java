/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import de.hybris.platform.servicelayer.model.ModelService;
import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.FlightService;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author pasop
 *
 */
public class TicketPrepareInterceptor implements PrepareInterceptor<TicketModel>
{

	private static final int CODE_LENGTH = 3;

	private EventService eventService;
	private TicketEvent ticketEvent;
	private FlightService flightService;

	@Override
	public void onPrepare(final TicketModel var1, final InterceptorContext var2) throws InterceptorException
	{
		// XXX Auto-generated method stub
		ticketEvent.setCode(generateTicketCode(var1));
		ticketEvent.setCodeFlight(var1.getFlight().getCode());

		var1.setCode(ticketEvent.getCode());

		eventService.publishEvent(ticketEvent);

	}

	private String generateTicketCode(TicketModel ticket) {

		if (ticket != null && ticket.getCode() != null) {
			return ticket.getCode();
		} else {
			return RandomStringUtils.randomAlphanumeric(CODE_LENGTH);
		}
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

	public FlightService getFlightService() {
		return flightService;
	}

	@Required
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}


}
