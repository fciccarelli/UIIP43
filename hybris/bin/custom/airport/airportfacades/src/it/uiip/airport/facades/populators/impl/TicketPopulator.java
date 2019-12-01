/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public class TicketPopulator implements Populator<TicketModel, TicketData>
{

	@Override
	public void populate(final TicketModel source, final TicketData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setCity(source.getNumberSeat());


	}


}
