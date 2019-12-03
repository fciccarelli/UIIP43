/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;



/**
 * @author fabiosessa
 *
 */
public class TicketEvent extends AbstractEvent
{
	private String code;
	private String numberSeat;

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

	/**
	 * @return the numberSeat
	 */
	public String getNumberSeat()
	{
		return numberSeat;
	}

	/**
	 * @param numberSeat
	 *           the numberSeat to set
	 */
	public void setNumberSeat(final String numberSeat)
	{
		this.numberSeat = numberSeat;
	}


}
