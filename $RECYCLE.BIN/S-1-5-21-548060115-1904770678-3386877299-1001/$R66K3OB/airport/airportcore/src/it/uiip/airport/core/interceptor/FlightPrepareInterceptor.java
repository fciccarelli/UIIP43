/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author ASUS
 *
 */
public class FlightPrepareInterceptor implements PrepareInterceptor<FlightModel>
{

	private final Logger log = LoggerFactory.getLogger(FlightPrepareInterceptor.class);

	@Override
	public void onPrepare(final FlightModel flightModel, final InterceptorContext ctx)
	{
		String codeTrim = flightModel.getCode();
		codeTrim.replaceAll(" ", "");
		// codeTrim= codeTrim.trim();

		if (codeTrim.length() > 12)
		{
			codeTrim = codeTrim.substring(0, 12);
			flightModel.setCode(codeTrim);
		}

		log.info("Trimming code", codeTrim);


	}

}
