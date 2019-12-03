package it.uiip.airport.core.event.listener;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.ticket.dao.TicketDao;
import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.TicketsService;
import it.uiip.airport.facades.data.TicketsData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class TicketEventListener extends AbstractEventListener<TicketEvent> {

    Logger log = LoggerFactory.getLogger(TicketEventListener.class);
    TicketsService ticketsService;

    @Override
    protected void onEvent(TicketEvent ticketEvent) {

        List<TicketModel> ticketModels = ticketsService.getTicketsForFlight(""+1);

        log.info("Lista Passeggeri aggiornata:");
        for(TicketModel tm : ticketModels){
            log.info("{}", tm.getCode());
            log.info("{}", tm.getNumberSeat());
            log.info("{}", tm.getPassenger().getName());
            log.info("{}", tm.getPassenger().getSurname());
            log.info("{}", tm.getPassenger().getPassport());
            log.info("<-------------------------------------------->");
        }
    }

    public TicketsService getTicketsService() {
        return ticketsService;
    }

    @Required
    public void setTicketsService(TicketsService ticketsService) {
        this.ticketsService = ticketsService;
    }
}
