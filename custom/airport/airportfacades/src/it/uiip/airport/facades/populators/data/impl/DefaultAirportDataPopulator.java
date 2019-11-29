/**
 *
 */
package it.uiip.airport.facades.populators.data.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.AirportModel;
import it.uiip.airport.facades.data.AirportData;


/**
 * @author pasop
 *
 */
public class DefaultAirportDataPopulator implements Populator<AirportModel, AirportData>
{

	@Override
	public void populate(final AirportModel source, final AirportData target) throws ConversionException
	{
		//		(source, "Parameter source cannot be null.");
		//		AssertNotNull(target, "Parameter source cannot be null.");
		target.setCode(source.getCode());
		target.setCity(source.getCity());
		target.setCountry(source.getCountry());
		target.setNRunways(source.getNRunways());
	}

}
