/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import it.uiip.airport.core.service.PassengerService;




/**
 * @author SimonaBranca
 *
 */
public class TicketEventListener extends AbstractEventListener<TicketEvent>
{

	private PassengerService passengerService;

	private final Logger log = LoggerFactory.getLogger(TicketEventListener.class);

	@Override
	protected void onEvent(final TicketEvent ticketEvent)
	{

		log.info("Logging Passengers");


		passengerService.getPassengersForCodeTicket(ticketEvent.getCode());

	}

	/**
	 * @return the passengerService
	 */
	public PassengerService getPassengerService()
	{
		return passengerService;
	}

	/**
	 * @param passengerService
	 *           the passengerService to set
	 */
	@Required
	public void setPassengerService(final PassengerService passengerService)
	{
		this.passengerService = passengerService;
	}



}
