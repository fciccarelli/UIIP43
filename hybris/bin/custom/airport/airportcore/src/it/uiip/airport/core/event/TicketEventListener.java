/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.dao.PassengerDao;




/**
 * @author SimonaBranca
 *
 */
public class TicketEventListener extends AbstractEventListener<TicketEvent>
{
	private PassengerDao passengerDao;

	private final Logger log = LoggerFactory.getLogger(TicketEventListener.class);

	@Override
	protected void onEvent(final TicketEvent ticketEvent)
	{

		log.info("Logging Passengers");

		passengerDao.findPassengersByCodeFlight("1");

	}



}
