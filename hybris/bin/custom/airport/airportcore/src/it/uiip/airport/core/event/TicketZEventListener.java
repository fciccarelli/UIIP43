
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.dao.TicketZDao;

/**
 *		@author ASUS
 */

public class TicketEventListener extends AbstractEventListener<TicketEvent>
	{


	private TicketZDao ticketDao;
	private final Logger log = LoggerFactory.getLogger(TicketEventListener.class);

	@Override
	protected void onEvent(final TicketEvent arg0);

	log.info("Logging Ticket");
	ticketDao.findTicketByCodeFlight("8");

}}



