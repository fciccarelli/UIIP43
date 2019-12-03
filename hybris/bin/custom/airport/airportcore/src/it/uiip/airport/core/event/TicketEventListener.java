/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.dao.impl.DefaultPassengerDao;
import it.uiip.airport.core.interceptor.impl.DafaultFlightPrepareInterceptor;
import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public class TicketEventListener extends AbstractEventListener<TicketEvent>
{
	private DefaultPassengerDao passengerDao;
	private ModelService modelService;
	private PassengerModel pass;


	@Override
	protected void onEvent(final TicketEvent tickEvent)
	{
		// XXX Auto-generated method stub
		final Logger log = LoggerFactory.getLogger(DafaultFlightPrepareInterceptor.class);
		final String code = "1";
		final List<PassengerModel> passenger = passengerDao.findPassenger(code);
		log.info("list passenger before ", passenger);
		passenger.add(pass);
		modelService.save(pass);
		log.info("list passenger after", passenger);

	}



}
