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
 * @author Luigi
 *
 */
public class PassengerInitDefaultInterceptor implements InitDefaultsInterceptor<PassengerModel>
{

	private final Logger log = LoggerFactory.getLogger(PassengerInitDefaultInterceptor.class);

	@Override
	public void onInitDefaults(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub

	}

	private void checkValidateDate(final PassengerModel passenger) {

		final Date localDate = new Date();

		if (passenger.getCurrentDate() != null)
		{
			log.info("Le due date sono diverse");
		}
		else
		{
			log.info("Le date sono uguali");
		}

	}






}










