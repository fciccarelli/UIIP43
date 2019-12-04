package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class TicketEvent extends AbstractEvent {

    private String code;
    private String codeFlight;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeFlight() {
        return codeFlight;
    }

    public void setCodeFlight(String codeFlight) {
        this.codeFlight = codeFlight;
    }
}
