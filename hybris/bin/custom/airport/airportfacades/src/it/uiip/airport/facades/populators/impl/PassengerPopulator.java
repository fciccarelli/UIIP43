/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.PassengerModel;



/**
 * @author ASUS
 *
 */
public class PassengerPopulator implements Populator<PassengerModel, PassengerData>
{

	@Override
	public void populate(final PassengerModel source, final PassengerData target) throws ConversionException
	{
		target.setCode(source.getPassport());
		target.setCity(source.getName());
		target.setCountry(source.getSurname());

	}


}
