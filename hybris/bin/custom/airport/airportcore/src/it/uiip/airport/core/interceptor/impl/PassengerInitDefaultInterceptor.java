/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.PassengerModel;

/**
 * @author pasop
 *
 */
public class PassengerInitDefaultInterceptor implements InitDefaultsInterceptor<PassengerModel>
{
	Logger log = LoggerFactory.getLogger(PassengerInitDefaultInterceptor.class);

	@Override
	public void onInitDefaults(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		checkValidateDate(arg0);
	}

	private String generateToken(final int n)
	{

		final String alphabeticString = "ABCDEFGHIJKLMNOPQRTUVWXYZ";
		final StringBuilder sb = new StringBuilder(n);

		final int index = (int) (alphabeticString.length() * Math.random());

		sb.append(alphabeticString.charAt(index));
		return sb.toString();
	}

	private boolean checkValidateDate(final PassengerModel passengerModel) {

		if (passengerModel.getCurrentDate().equals(new Date()))
		{
			log.info("The date is valid");
			return true;
		}
		else
		{
			log.info("The date is note valid");
			return false;
		}
	}

}
