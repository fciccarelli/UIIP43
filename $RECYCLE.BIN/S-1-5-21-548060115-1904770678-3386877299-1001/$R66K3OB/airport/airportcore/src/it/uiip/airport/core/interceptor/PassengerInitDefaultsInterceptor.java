/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author sdeli
 *
 */
public class PassengerInitDefaultsInterceptor implements InitDefaultsInterceptor<PassengerModel>
{

	private final Logger log = LoggerFactory.getLogger(PassengerPrepareInterceptor.class);

	@Override
	public void onInitDefaults(final PassengerModel var1, final InterceptorContext var2) throws InterceptorException
	{

		if (var1 instanceof PassengerModel)
		{

			checkDatePassenger(var1);

		}


	}

	private void checkDatePassenger(final PassengerModel passenger)
	{

		final Date localDate = new Date();

		if (passenger.getCurrentDate().equals(localDate))
		{

			log.info("La Data è uguale", passenger.getCurrentDate());

		}
		log.info("La Data non è uguale", passenger.getCurrentDate());

	}

}
