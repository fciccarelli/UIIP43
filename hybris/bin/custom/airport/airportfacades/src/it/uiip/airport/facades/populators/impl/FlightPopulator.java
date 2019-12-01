/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;

import com.thoughtworks.xstream.converters.ConversionException;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author ASUS
 *
 */
public class FlightPopulator implements Populator<FlightModel, FlightData>
{

	@Override
	public void populate(final FlightModel source, final FlightData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setCity(source.getDayWeek());
		target.setCountry(source.getDepartureTime());
		target.setNRunways(source.getTimeArrival());

	}


}
