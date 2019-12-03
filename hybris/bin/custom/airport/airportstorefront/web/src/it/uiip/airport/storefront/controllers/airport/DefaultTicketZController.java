/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uiip.airport.core.model.TicketModel;
import it.uiip.airport.facades.PassengerFacade;
import it.uiip.airport.facades.TicketZFacade;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.facades.data.TicketZData;
import it.uiip.airport.storefront.controllers.ControllerConstants;





/**
 * @author soprasteria
 *
 */
public class DefaultTicketZController extends AbstractPageController
{
	Logger logger = LoggerFactory.getLogger(DefaultTicketZController.class);
	private static final String TICKETZ_SEARCH_CODE_PATTERN = "/search";
	private ModelService modelService;


	@Resource(name = "ticketZFacade")
	private TicketZFacade ticketZFacade;

	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;


	@RequestMapping(value = TICKETZ_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showTicketZ(@RequestParam("code")
	final String code, final ModelMap model1, final ModelMap model2)
	{
		final List<TicketZData> ticketZData = ticketZFacade.getTicketByCodeFlight(code);
		final List<PassengerData> passData = passengerFacade.getPassengerByTicket(code);
		//model.addAttribute("code", ticketData.getCode());
		//model.addAttribute("numberSeat", ticketData.getNumberSeat());
		//model.addAttribute("country", ticketData.getCountry());
		//model.addAttribute("nRunways", ticketData.getNRunways());

		model1.put("ticketData", ticketZData);
		model2.put("passengerData", passData);
		logger.info("sono sulla pagina web");
		return ControllerConstants.Views.Pages.ShowAirport.StoreFinderShowAirport;
	}

	@RequestMapping(value = "/addTicket", method = RequestMethod.POST)
	public String submit(@Valid
	@ModelAttribute("ticket")
	final TicketZData ticketData, final BindingResult result, final ModelMap model)
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
		//ticket.setCode(RandomStringUtils.randomAlphanumeric(12));
		//	ticket.setNumberSeat(RandomStringUtils.randomAlphanumeric(3));
     //return "ticketView";

		return ControllerConstants.Views.Pages.SubmitTicket.StoreFinderSubmitTicket;
	}

}
