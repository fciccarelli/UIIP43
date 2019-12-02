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
 * @author Luigi
 *
 */
public class PassengerPrepareInterceptor implements PrepareInterceptor<PassengerModel>
{

	private final Logger log = LoggerFactory.getLogger(PassengerPrepareInterceptor.class);

	@Override
	public void onPrepare(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		setPassportUpperCase(arg0);
	}

	private void setPassportUpperCase(final PassengerModel passenger)
	{

		if (passenger != null)
		{
			passenger.setPassport(passenger.getPassport().toUpperCase());
		}
		log.info("Changed passport string to uppercase", passenger.getPassport());

	}

}
