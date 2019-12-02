/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author SimonaBranca
 *
 */
public class FlightPrepareInterceptor implements PrepareInterceptor<FlightModel>
{

	private final Logger log = LoggerFactory.getLogger(FlightPrepareInterceptor.class);

	@Override
	public void onPrepare(final FlightModel flightModel, final InterceptorContext ctx)
	{

		String codeFlightModel = flightModel.getCode();
		codeFlightModel = codeFlightModel.replaceAll(" ", "");

		if (codeFlightModel.length() > 12)
		{
			codeFlightModel = codeFlightModel.substring(0, 12);
			flightModel.setCode(codeFlightModel);
		}

		log.info("CodeFlightModel changed: setting the trim", codeFlightModel);
	}

}
