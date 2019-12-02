
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author fabiosessa
 *
 */
public class DefaultPassengerPrepareInterceptor implements PrepareInterceptor<PassengerModel>
{
	private final Logger log = org.slf4j.LoggerFactory.getLogger(DefaultPassengerPrepareInterceptor.class);
	@Override
	public void onPrepare(final PassengerModel pass, final InterceptorContext arg1) throws InterceptorException
	{
		// XXX Auto-generated method stub
		setPassengerUpperCase(pass);

	}

	private void setPassengerUpperCase(final PassengerModel pass) throws InterceptorException
	{
		if (pass instanceof PassengerModel)
		{
			if (pass.getPassport() != null)
			{
				pass.getPassport().toUpperCase();
			}
			else
			{
				throw new InterceptorException(" passport is null");
			}
		}
		log.info("sto mettendo il passenger model in upperCase");
	}

}
