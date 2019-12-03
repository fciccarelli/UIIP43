/**
 *
 */
package it.uiip.airport.core.event;

/**
 * @author ASUS
 *
 */

public class TicketZEvent extends AbstractEvent
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
