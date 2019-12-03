/**
 *
 */
package it.uiip.airport.storefront.controllers.passenger;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.TicketsData;
import it.uiip.airport.storefront.controllers.ControllerConstants;

/**
 * @author SimonaBranca
 *
 */

@Controller
@RequestMapping(value = "/passengerController")
public class DefaultPassengerController extends AbstractPageController
{
	private static final String PASSENGER_SEARCH_CODE_PATTERN = "/search";
	private ModelService modelService;

	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;

	@RequestMapping(value = PASSENGER_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showPassengers(@RequestParam("code")
	final String code, final ModelMap model)
	{

		final List<PassengerData> passengers = passengerFacade.searchPassengersForCodeFlight(code);
		model.put("passengers", passengers);

		return ControllerConstants.Views.Pages.ShowPassengers.StoreFinderShowPassengers;
	}


	@RequestMapping(value = "/addTicket", method = RequestMethod.POST)
	public String submit(@Valid
	@ModelAttribute("ticket")
	final TicketsData ticketData, final BindingResult result, final ModelMap model)
	{
		if (result.hasErrors())
		{
			return "error";
		}
		model.addAttribute("code", ticketData.getCode());
		model.addAttribute("numberSeat", ticketData.getNumberSeat());
		model.addAttribute("name", ticketData.getPassenger().getName());
		model.addAttribute("surname", ticketData.getPassenger().getSurname());
		model.addAttribute("passport", ticketData.getPassenger().getPassport());
		final TicketModel ticket = modelService.create(TicketModel.class);
		//		ticket.setCode(RandomStringUtils.randomAlphanumeric(12));
		//		ticket.setNumberSeat(RandomStringUtils.randomAlphanumeric(3));
		return "ticketView";

	}


}
