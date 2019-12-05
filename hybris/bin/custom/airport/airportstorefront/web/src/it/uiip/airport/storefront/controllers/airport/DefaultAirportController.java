/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.uiip.airport.core.model.FlightModel;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.core.service.FlightService;
import it.uiip.airport.core.service.PassengerService;
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
	private static final String TICKET_FILTER_PATTERN = "/passengersTicket";
	private static final String TICKET_REGISTRATION_INFO_PATTERN = "/newTicket";
	private static final String TICKET_REGISTRATION_PATTERN = "/addTicket";

	public static final int CODE_LENGTH = 4;
	public static final int SEAT_CODE_LENGTH = 1;

	@Resource(name = "airportFacade")
	private AirportFacade airportFacade;

	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;

	@Resource(name = "flightFacade")
	private FlightFacade flightFacade;

	@Resource(name = "flightService")
	private FlightService flightService;

	@Resource(name = "ticketsFacade")
	private TicketsFacade ticketFacade;

	@Resource(name= "modelService")
	private ModelService modelService;

	@Resource(name= "passengerService")
	private PassengerService passengerService;


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
	final String code, final ModelMap model)
	{
		final List<PassengerData> passengersData = passengerFacade.getPassengersByFlight(code);
		model.put("passengersData", passengersData);
		return ControllerConstants.Views.Pages.ShowPassengers.StoreFinderShowPassengers;
	}

	@RequestMapping(value = TICKET_FILTER_PATTERN, method = RequestMethod.GET)
	public String showPassengersTickets(@RequestParam("code")
								 final String code, final ModelMap model)
	{
		final List<TicketsData> ticketsData = ticketFacade.getTicketsListForFlight(code);
		model.put("ticketsData", ticketsData);
		return ControllerConstants.Views.Pages.StoreFinderShowPassengersTicket.StoreFinderShowPassengersTicket;
	}

//	@RequestMapping(value = TICKET_REGISTRATION_INFO_PATTERN)
//	public String showNewTicketForm(){
// 		return ControllerConstants.Views.Pages.StoreNewTicket.NewTicketForm;
//	}

	@RequestMapping(value = "/registerTicket", method = RequestMethod.GET)
	public ModelAndView showForm(final ModelMap model)
	{
		final List<FlightData> flightsData = flightFacade.getAllFlights();
		model.put("flightsData", flightsData);
		return new ModelAndView(ControllerConstants.Views.Pages.StoreNewTicket.NewTicketForm, "passenger", new PassengerData());
	}

	@RequestMapping(value = TICKET_REGISTRATION_PATTERN, method=RequestMethod.POST )
	public String submit(@Valid @ModelAttribute("passenger") final PassengerData newPassenger, final BindingResult result, final Model model){
		if(result.hasErrors()){
			return "error";
		}

		final TicketModel ticket = modelService.create(TicketModel.class);
		ticket.setNumberSeat(RandomStringUtils.randomAlphabetic(SEAT_CODE_LENGTH) + RandomStringUtils.random(SEAT_CODE_LENGTH));

		final PassengerModel passenger = modelService.create(PassengerModel.class);
		passenger.setUid(newPassenger.getUid());
		passenger.setName(newPassenger.getName());
		passenger.setSurname(newPassenger.getSurname());
		passenger.setPassport(newPassenger.getPassport());


		final FlightModel flight = flightService.getFlightByCode("1");
		final List<TicketModel> ticketList = flightService.getTicketByFlight(flight.getCode());
		final List<PassengerModel> passengersList = passengerService.getPassengersForFlight(flight.getCode());
		flight.setTickets(ticketList);
		final List<PassengerModel> tempPassengerList = new ArrayList<>();
		tempPassengerList.addAll(passengersList);
		tempPassengerList.add(passenger);
		flight.setPassengers(tempPassengerList);
		ticket.setFlight(flight);
		ticket.setPassenger(passenger);

		modelService.save(tempPassengerList.get(tempPassengerList.size() - 1));
		modelService.save(flight);
		modelService.save(ticket);


		//Creare numero biglietto e posto, se è stato creato correttamente
		model.addAttribute("name", newPassenger.getName());
		model.addAttribute("surname", newPassenger.getSurname());
		model.addAttribute("passport", newPassenger.getPassport());
		model.addAttribute("code", newPassenger.getTicket().getCode());
		model.addAttribute("code", newPassenger.getTicket().getNumberSeat());

		return ControllerConstants.Views.Pages.NewTicketRegistered.NewTicketRegistered;
	}

//	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//	public String submit(@Valid @ModelAttribute("employee")Employee employee,
//						 BindingResult result, ModelMap model) {
//		if (result.hasErrors()) {
//			return "error";
//		}
//		model.addAttribute("name", employee.getName());
//		model.addAttribute("contactNumber", employee.getContactNumber());
//		model.addAttribute("id", employee.getId());
//		return "employeeView";
//	}
}
