package it.uiip.airport.core.event.listener;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.ticket.dao.TicketDao;
import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.FlightService;
import it.uiip.airport.core.service.PassengerService;
import it.uiip.airport.core.service.TicketsService;
import it.uiip.airport.facades.data.TicketsData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class TicketEventListener extends AbstractEventListener<TicketEvent> {

    Logger log = LoggerFactory.getLogger(TicketEventListener.class);

    PassengerService passengerService;
    FlightService flightService;

    @Override
    protected void onEvent(TicketEvent ticketEvent) {

//        List<PassengerModel> passengersModel = passengerService.getPassengersForTicket(ticketEvent.getCode());
//        FlightModel flight = flightService.getFlightByTicket(ticketEvent.getCode());
        FlightModel flight = flightService.getFlightByCode(ticketEvent.getCodeFlight());

        log.info("Passenger list updated for flight number:");
        for(PassengerModel pm : flight.getPassengers()){
            log.info("{}", pm.getUid());
            log.info("{}", pm.getName());
            log.info("{}", pm.getSurname());
            log.info("{}", pm.getPassport());
            log.info("<-------------------------------------------->");
        }
    }

    public PassengerService getPassengerService() {
        return passengerService;
    }

    @Required
    public void setPassengerService(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    public FlightService getFlightService() {
        return flightService;
    }

    @Required
    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }
}
