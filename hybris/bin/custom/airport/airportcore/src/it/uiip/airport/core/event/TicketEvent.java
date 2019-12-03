package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;
import org.springframework.beans.factory.annotation.Required;

public class TicketEvent extends AbstractEvent {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
