/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author aDeAngelis
 *
 */
public class PassengerPrepareIntercetor implements PrepareInterceptor<PassengerModel>
{

	private final Logger log = LoggerFactory.getLogger(PassengerPrepareIntercetor.class);

	@Override
	public void onPrepare(final PassengerModel passengerModel, final InterceptorContext ctx) throws InterceptorException
	{
	}


	private void setPassportUpperCase(final PassengerModel passengerModel)
	{

		if (passengerModel.getPassport() != null)

			{
			passengerModel.getPassport().toUpperCase();
			}

		log.info("I'm putting the passenger model in uppercase", passengerModel.getPassport());

	}

}
