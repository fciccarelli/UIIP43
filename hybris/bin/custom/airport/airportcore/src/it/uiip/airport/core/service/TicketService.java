/**
 *
 */
package it.uiip.airport.core.service;


import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public interface TicketService
{


	TicketModel getTicketForCode(String code);
}
