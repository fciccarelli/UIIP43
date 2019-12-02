/**
 *
 */
package it.uiip.airport.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.TicketsData;


/**
 * @author fabiosessa
 *
 */
public class TicketsPopulator implements Populator<TicketModel, TicketsData>
{

	@Override
	public void populate(final TicketModel source, final TicketsData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setCode(source.getCode());
		target.setNumberSeat(source.getNumberSeat());

	}

}
