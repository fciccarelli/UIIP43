/**
 *
 */
package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.facades.data.FlightData;


/**
 * @author fabiosessa
 *
 */
public class FlightPopulator implements Populator<FlightModel, FlightData>
{

	@Override
	public void populate(final FlightModel source, final FlightData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setCode(source.getCode());
		target.setDayWeek(source.getDayWeek());
		target.setDepartureTime(source.getDepartureTime());
		target.setTimeArrival(source.getTimeArrival());

	}

}
