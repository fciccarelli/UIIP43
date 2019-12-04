/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.facade.AirportFacade;
import it.uiip.airport.facade.FlightFacade;
import it.uiip.airport.facade.PassengerFacade;
import it.uiip.airport.facade.TicketsFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.storefront.controllers.ControllerConstants;

/**
 * @author fabiosessa
 *
 */

@Controller
@RequestMapping(value = "/airportController")
public class DafaultAirportController extends AbstractPageController
{

	private static final String AIRPORT_SEARCH_CODE_PATTERN = "/search";
	private static final String FLIGHT_SEARCH_CODE_PATTERN = "/searchF";

	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;
	@Resource(name = "flightFacade")
	private FlightFacade flightFacade;
	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;
	@Resource(name = "ticketFacade")
	private TicketsFacade ticketsFacade;


	@RequestMapping(value = AIRPORT_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showAirport(@RequestParam("code")
	final String code, final Model model)
	{
		final AirportData airportData = airportFacade.searchAirport(code);
		model.addAttribute("code", airportData.getCode());
		model.addAttribute("city", airportData.getCity());
		model.addAttribute("country", airportData.getCountry());
		model.addAttribute("nRunways", airportData.getNRunways());

		return ControllerConstants.Views.Pages.ShowAirport.StoreFinderShowAirport;
	}

	@RequestMapping(value = FLIGHT_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showPassenger(@RequestParam("code")
	final String code, final ModelMap model)
	{

		final List<PassengerData> passengerData = passengerFacade.searchPassenger(code);
		model.put("passengerData", passengerData);

		return ControllerConstants.Views.Pages.ShowPassenger.StoreFinderShowPassenger;
	}





	private static final String PASSENGER_INSERT_CODE_PATTERN = "/passenger";

	@Resource(name = "modelService")
	private ModelService modelService;

	@RequestMapping(value = PASSENGER_INSERT_CODE_PATTERN, method = RequestMethod.GET)
	public String submit(@ModelAttribute("passenger")
	final PassengerData passenger, final Model model)
	{
		final PassengerModel pass = modelService.create(PassengerModel.class);
		pass.setName(passenger.getName());
		pass.setSurname(passenger.getSurname());
		pass.setPassport(passenger.getPassport());

		return ControllerConstants.Views.Pages.NewPassenger.StoreNewPassenger;
	}

}

