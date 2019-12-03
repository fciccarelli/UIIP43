/**
 *
 */
package it.uiip.airport.core.service;

import java.util.List;

import bootstrap.gensrc.it.uiip.airport.core.model.TicketModel;


/**
 * @author asus
 *
 */
public interface TicketZService
{
	List<TicketModel> getTicketForCode(String code);
}
