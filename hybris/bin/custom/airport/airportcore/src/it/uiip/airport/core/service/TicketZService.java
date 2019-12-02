/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author aDeangelis
 *
 */
public interface TicketZService
{
	List<TicketModel> getTicketForCode(String code);
}
