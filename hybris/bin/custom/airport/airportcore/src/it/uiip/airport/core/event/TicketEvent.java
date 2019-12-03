/**
 *
 */
package it.uiip.airport.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import org.springframework.beans.factory.annotation.Required;


/**
 * @author soprasteria
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
	@Required
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
	@Required
	public void setNumberSeat(final String numberSeat)
	{
		this.numberSeat = numberSeat;
	}

}

