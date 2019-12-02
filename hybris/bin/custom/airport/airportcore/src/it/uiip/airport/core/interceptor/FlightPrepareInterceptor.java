/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author aDeAngelis
 *
 */
public class FlightPrepareInterceptor implements PrepareInterceptor<FlightModel>
{

	private final Logger log = LoggerFactory.getLogger(FlightPrepareInterceptor.class);

	@Override
	public void onPrepare(final FlightModel flightModel, final InterceptorContext ctx)
	{
		String codeTrim = flightModel.getCode().replaceAll(" ", "");

		//	codeTrim= codeTrim.trim();

		if (codeTrim.length() > 12)
		{
			codeTrim = codeTrim.substring(0, 12);
			flightModel.setCode(codeTrim);
		}

		log.info("Code FlightModel changed; setting the trim  ", codeTrim);


	}

}
