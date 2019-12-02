/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Date;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author aDeAngelis
 *
 */
public class PassengerInitDefaultsInterceptor implements InitDefaultsInterceptor<PassengerModel>
{


	@Override
	public void onInitDefaults(final PassengerModel arg0, final InterceptorContext arg1) throws InterceptorException
	{
		checkValuateDate(arg0);
	}

	private void checkValuateDate(final PassengerModel pass)
	{

		if (pass.getCurrentDate() != null)

		{
			if (pass.getCurrentDate() == new Date())
			{
				return;
			}
		}
	}







}
