/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.FlightFacade;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.TicketsFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.TicketsData;
import it.uiip.airport.storefront.controllers.ControllerConstants;


/**
 * @author pasop
 *
 */
@Controller
@RequestMapping(value = "/airportController")
public class DefaultAirportController extends AbstractPageController
{

	private static final String AIRPORT_SEARCH_CODE_PATTERN = "/search";
	private static final String PASSENGER_FILTER_PATTERN = "/passengers";
	private static final String FIND_PASSENGER_FILTER_PATTERN = "/findPassengers";

	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;

	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;

	@Resource(name = "flightFacade")
	private FlightFacade flightFacade;

	@Resource(name = "ticketsFacade")
	private TicketsFacade ticketFacade;


 	@RequestMapping(value = AIRPORT_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showAirport(@RequestParam("code")
	final String code, final Model model)
	{
		final AirportData airportData = airportFacade.getAirportByCode(code);
		model.addAttribute("code", airportData.getCode());
		model.addAttribute("city", airportData.getCity());
		model.addAttribute("country", airportData.getCountry());
		model.addAttribute("nRunways", airportData.getNRunways());

		return ControllerConstants.Views.Pages.ShowAirport.StoreFinderShowAirport;
	}

	@RequestMapping(value = PASSENGER_FILTER_PATTERN, method = RequestMethod.GET)
	public String showPassengers(@RequestParam("code")
	final String code, final Model model)
	{
		final List<PassengerData> passengersData = passengerFacade.getPassengersByFlight(code);

		model.addAttribute("passengersData", passengersData);
		return ControllerConstants.Views.Pages.ShowPassengers.StoreFinderShowPassengers;
	}

	@RequestMapping(value = FIND_PASSENGER_FILTER_PATTERN, method = RequestMethod.GET)
	public String findPassengers(@RequestParam("code")
	final String code, final Model model)
	{
		final List<PassengerData> passengersData = passengerFacade.getPassengersByFlight(code);
		final List<FlightData> flightsData = flightFacade.getAllFlights();
		final List<TicketsData> ticketData = ticketFacade.getAllTickets();

		model.addAttribute("passengersData", passengersData);
		model.addAttribute("ticketNumber", ticketData.get(Integer.parseInt(code)).getCode());
		model.addAttribute("numberSeat", ticketData.get(Integer.parseInt(code)).getNumberSeat());

		return ControllerConstants.Views.Pages.ShowPassengers.StoreFinderShowPassengers;
	}

}
