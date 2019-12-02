/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.time.LocalDate;

import it.uiip.airport.core.model.PassengerModel;


/**
 * @author SimonaBranca
 *
 */
public class PassengerInitDefaultsInterceptor implements InitDefaultsInterceptor<PassengerModel>
{

	public static final String CURRENTTIME = "currentTime";
	public static final String CURRENTDATA = "currentData";

	@Override
	public void onInitDefaults(final PassengerModel passengerModel, final InterceptorContext ctx) throws InterceptorException
	{

		checkValidateDate(passengerModel);

	}

	public boolean checkValidateDate(final PassengerModel passengerModel) throws InterceptorException
	{

		final LocalDate today = LocalDate.now();
		if (passengerModel.getCurrentDate().equals(today))
		{

			return true;
		}
		else
		{

			throw new InterceptorException("Error: currentData must be the same as today");
		}
	}


	/**
	 * @return the currenttime
	 */
	public static String getCurrenttime()
	{
		return CURRENTTIME;
	}

	/**
	 * @return the currentdata
	 */
	public static String getCurrentdata()
	{
		return CURRENTDATA;
	}




}


