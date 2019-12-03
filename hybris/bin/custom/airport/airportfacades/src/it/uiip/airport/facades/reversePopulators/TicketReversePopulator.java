package it.uiip.airport.facades.reversePopulators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.data.TicketsData;

public class TicketReversePopulator implements Populator<TicketsData, TicketModel> {
    @Override
    public void populate(TicketsData ticketsData, TicketModel ticketModel) throws ConversionException {
        ticketModel.setCode(ticketsData.getCode());
        ticketModel.setNumberSeat(ticketsData.getNumberSeat());
    }
}
