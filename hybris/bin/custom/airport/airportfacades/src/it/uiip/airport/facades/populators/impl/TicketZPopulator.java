/**
 *
 */
package it.uiip.airport.facades.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.TicketZData;



/**
 * @author aDeangeliss
 *
 */
public class TicketZPopulator implements Populator<TicketModel, TicketZData>
{

	@Override
	public void populate(final TicketModel source, final TicketZData target) throws ConversionException
	{


		target.setCode(source.getCode());
		target.setNumberSeat(source.getNumberSeat());
	}

}
