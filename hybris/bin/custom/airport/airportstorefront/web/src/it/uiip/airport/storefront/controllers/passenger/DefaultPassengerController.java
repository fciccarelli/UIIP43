/**
 *
 */
package it.uiip.airport.storefront.controllers.passenger;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.data.PassengerData;
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

	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;

	@RequestMapping(value = PASSENGER_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showPassengers(@RequestParam("code")
	final String code, final Model model)
	{

		final List<PassengerData> passengers = passengerFacade.searchPassengersForCodeFlight(code);
		//		model.addAttribute("passport", passengerData.getPassport());
		//		model.addAttribute("name", passengerData.getName());
		//		model.addAttribute("surname", passengerData.getSurname());
		model.addAttribute("passengers", passengers);

		return ControllerConstants.Views.Pages.ShowPassengers.StoreFinderShowPassengers;
	}

}
