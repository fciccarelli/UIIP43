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
 * @author pasop
 *
 */
public class PassengerPrepareInterceptor implements PrepareInterceptor<PassengerModel>
{

	private final Logger log = LoggerFactory.getLogger(PassengerPrepareInterceptor.class);

	@Override
	public void onPrepare(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		if (arg0 instanceof PassengerModel)
		{
			setPassportUpperCase(arg0);
		}

	}

	private void setPassportUpperCase(final PassengerModel passengerModel)
	{

		if (passengerModel != null)
		{
			passengerModel.setPassport(passengerModel.getPassport().toUpperCase());
		}
		log.info("The passport has been set to upper case {}", passengerModel.getPassport());

	}
}
