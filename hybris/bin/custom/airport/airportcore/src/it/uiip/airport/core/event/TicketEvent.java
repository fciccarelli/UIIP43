/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * @author SimonaBranca
 *
 */
public class TicketEvent extends AbstractEvent
{

	private String code;

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
