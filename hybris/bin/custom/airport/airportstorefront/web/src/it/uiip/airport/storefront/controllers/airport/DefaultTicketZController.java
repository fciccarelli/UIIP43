/**
 *
 */
package it.uiip.ticketZ.storefront.controllers.ticketZ;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.facades.TicketZFacade;
import it.uiip.airport.facades.data.TicketData;
import it.uiip.airport.storefront.controllers.ControllerConstants;


/**
 * @author Luigi
 *
 */
@Controller
@RequestMapping(value = "/ticketZController")
public class DefaultTicketZController extends AbstractPageController
{

	private static final String TICKETZ_SEARCH_CODE_PATTERN = "/search";

	@Resource(name = "ticketZFacade")
	private TicketZFacade ticketZFacade;

	@RequestMapping(value = TICKETZ_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showTicketZ(@RequestParam("code")
	final String code, final Model model)
	{
		final List<TicketData> ticketData = ticketZFacade.getTicketByCodeFlight(code);
		for (int i = 0; i < ticketData.size(); i++)
		{
			model.addAttribute("code", ticketData.get(i).getCode());
			model.addAttribute("name", ticketData.get(i).getName());
			model.addAttribute("surname", ticketData.get(i).getSurname());
			model.addAttribute("numberSeat", ticketData.get(i).getNumberSeat());
		}

		return ControllerConstants.Views.Pages.ShowTicket.StoreFinderShowTicketZ;

	}
}
