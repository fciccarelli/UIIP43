/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.service.TicketZService;


/**
 * @author soprasteria
 *
 */
public class TicketEventListener extends AbstractEventListener<TicketEvent>
{
	private TicketZService ticketZService;
	private final Logger log = LoggerFactory.getLogger(TicketEventListener.class);


	@Override
	protected void onEvent(final TicketEvent ticketEvent)
	{
		log.info("Logging Ticket");
		ticketZService.getTicketForCode(ticketEvent.getCode());
	}




}
