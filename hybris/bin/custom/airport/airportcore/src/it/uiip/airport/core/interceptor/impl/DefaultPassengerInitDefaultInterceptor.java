/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.time.LocalDate;
import java.util.Random;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultPassengerInitDefaultInterceptor implements InitDefaultsInterceptor<PassengerModel>
{

	@Override
	public void onInitDefaults(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub

	}

	private void setToken(final PassengerModel pass)
	{
		final Random r = new Random();
		final String random = r.toString();
		//String random = RandomStringUtils.random(5);

		//qpass.setTokens(random);

	}

	private boolean checkValidateDate(final PassengerModel pass) throws InterceptorException
	{
		final LocalDate today = LocalDate.now();
		if (pass.getCurrentDate().equals(today))
		{
			return true;
		}
		else
		{
			throw new InterceptorException("date is not today");
		}

	}

}
