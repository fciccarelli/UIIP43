/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.interceptor.impl.DafaultFlightPrepareInterceptor;
import it.uiip.airport.core.service.TicketsService;


/**
 * @author fabiosessa
 *
 */
public class TicketEventListener extends AbstractEventListener<TicketEvent>
{
	private TicketsService ticketService;
	private ModelService modelService;


	@Override
	protected void onEvent(final TicketEvent tickEvent)
	{
		// XXX Auto-generated method stub
		final Logger log = LoggerFactory.getLogger(DafaultFlightPrepareInterceptor.class);
		final String code = "1";
		ticketService.getPassengerForCodeTicket(code);


	}


	/**
	 * @return the ticketService
	 */
	public TicketsService getTicketService()
	{
		return ticketService;
	}


	/**
	 * @param ticketService
	 *           the ticketService to set
	 */
	@Required
	public void setTicketService(final TicketsService ticketService)
	{
		this.ticketService = ticketService;
	}



}
