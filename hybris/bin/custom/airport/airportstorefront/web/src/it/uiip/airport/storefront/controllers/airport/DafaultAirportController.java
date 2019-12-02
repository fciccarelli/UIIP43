/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.facade.AirportFacade;
import it.uiip.airport.facade.FlightFacade;
import it.uiip.airport.facade.PassengerFacade;
import it.uiip.airport.facade.TicketsFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.facades.data.FlightData;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.TicketsData;
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
	final String code, final Model model)
	{

		final FlightData flightData = flightFacade.searchFlight(code);
		model.addAttribute("code", flightData.getCode());
		model.addAttribute("dayWeek", flightData.getDayWeek());
		model.addAttribute("departureTime", flightData.getDepartureTime());
		model.addAttribute("timeArrival", flightData.getTimeArrival());

		final String t = FlightModel.TICKETS;
		final String[] t1 = t.split(",");
		for (int i = 0; i < t1.length; i++)
		{
			final TicketsData ticketData = ticketsFacade.searchTicket(t1[i]);
			model.addAttribute("code", ticketData.getCode());
			model.addAttribute("numberSeat", ticketData.getNumberSeat());
		}

		final String p = FlightModel.PASSENGERS;
		final String[] p1 = p.split(",");
		for (int i = 0; i < p1.length; i++)
		{
			final PassengerData passengerData = passengerFacade.searchPassenger(p1[i]);
			model.addAttribute("name", passengerData.getName());
			model.addAttribute("surname", passengerData.getSurname());
		}









		return ControllerConstants.Views.Pages.ShowPassenger.StoreFinderShowPassenger;
	}

}

