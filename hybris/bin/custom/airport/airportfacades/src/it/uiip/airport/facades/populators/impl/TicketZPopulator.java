/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.TicketData;


/**
 * @author Luigi
 *
 */
public class TicketZPopulator implements Populator<TicketModel, TicketData>
{

	@Override
	public void populate(final TicketModel source, final TicketData target) throws ConversionException
	{

		target.setName(source.getPassenger().getName());
		target.setSurname(source.getPassenger().getSurname());
		target.setCode(source.getCode());
		target.setNumberSeat(source.getNumberSeat());
	}

}
