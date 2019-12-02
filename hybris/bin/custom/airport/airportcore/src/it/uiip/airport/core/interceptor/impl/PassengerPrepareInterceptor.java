/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author SimonaBranca
 *
 */
public class PassengerPrepareInterceptor implements PrepareInterceptor<PassengerModel>
{

	private final Logger log = LoggerFactory.getLogger(PrepareInterceptor.class);

	public void setPassportUpperCase(final PassengerModel passengerModel)
	{

		final String passport = passengerModel.getPassport();

		if (passport != null)
		{

			passport.toUpperCase();

		}

		log.info("Passport changed, setting upper case", passport);
	}

	@Override
	public void onPrepare(final PassengerModel passengerModel, final InterceptorContext ctx) throws InterceptorException
	{
		// XXX Auto-generated method stub

	}

}
