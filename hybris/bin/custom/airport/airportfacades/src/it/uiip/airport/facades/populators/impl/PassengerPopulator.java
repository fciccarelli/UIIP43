/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.facades.data.PassengerData;


/**
 * @author pasop
 *
 */
public class PassengerPopulator implements Populator<PassengerModel, PassengerData>
{

	@Override
	public void populate(final PassengerModel source, final PassengerData target) throws ConversionException
	{

		target.setUid(source.getUid());
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setPassport(source.getPassport());

	}

}
