/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * @author sdeli
 *
 */
public class TicketEvent extends AbstractEvent
{

	String code;

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code
	 *           the code to set
	 */
	public void setCode(final String code)
	{
		this.code = code;
	}



}
