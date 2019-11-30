/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.facades.data.FlightData;


/**
 * @author pasop
 *
 */
public class FlightPopulator implements Populator<FlightModel, FlightData>
{

	@Override
	public void populate(final FlightModel source, final FlightData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setDayWeek(source.getDayWeek());
		target.setDepartureTime(source.getDepartureTime());
		target.setTimeArrival(source.getTimeArrival());
	}

}
