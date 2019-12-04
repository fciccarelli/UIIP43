/**
 *
 */
package it.uiip.airport.core.interceptor.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import de.hybris.platform.servicelayer.model.ModelService;
import it.uiip.airport.core.event.TicketEvent;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.FlightService;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author pasop
 *
 */
public class TicketInitDefaultInterceptor implements InitDefaultsInterceptor<TicketModel> {

    @Override
    public void onInitDefaults(final TicketModel var1, final InterceptorContext var2) throws InterceptorException {
        // XXX Auto-generated method stub

    }

}
