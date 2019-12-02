/**
 *
 */
package it.uiip.airport.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import it.uiip.airport.core.model.TicketModel;


/**
 * @author ASUS
 *
 */
public abstract class TicketZPrepareInterceptor implements PrepareInterceptor<TicketModel>
{

	//	private final Logger log = LoggerFactory.getLogger(TicketZPrepareInterceptor.class);
	//
	//	@Override
	//	public void onPrepare(final TicketModel var1, final InterceptorContext var2) throws InterceptorException
	//	{
	//		// XXX Auto-generated method stub
	//		if (var1 instanceof TicketModel)
	//		{
	//
	//			setCode(var1);
	//
	//		}
	//
	//		private void setCode(final TicketModel ticket)
	//		{
	//
	//			if (ticket != null)
	//			{
	//
	//				ticket.setCode(ticket.getCode());
	//			}
	//			log.info("Code setted", ticket.getTicket());
	//		}
	//	}



}
