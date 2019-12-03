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
import org.springframework.stereotype.Controller;
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
import it.uiip.airport.facades.data.TicketData;
import it.uiip.airport.storefront.controllers.ControllerConstants;


/**
 * @author sdeli
 *
 */
@Controller
@RequestMapping(value = "/ticketZController")
public class DefaultTicketZController extends AbstractPageController
{

	Logger logger = LoggerFactory.getLogger(DefaultTicketZController.class);
	private static final String TICKETZ_SEARCH_CODE_PATTERN = "/search";

	private ModelService modelservice;

	@Resource(name = "ticketZFacade")
	private TicketZFacade ticketZFacade;

	@Resource(name = "passengerFacade")
	private PassengerFacade passengerFacade;

	@RequestMapping(value = TICKETZ_SEARCH_CODE_PATTERN, method = RequestMethod.GET)
	public String showTicketZ(@RequestParam("code")
	final String code, final ModelMap model1, final ModelMap model2)
	{
		final List<TicketData> ticketData = ticketZFacade.getTicketByCodeFlight(code);
		final List<PassengerData> passData = passengerFacade.getPassengerByTicket(code);
		//		for (int i = 0; i < ticketData.size(); i++)
		//		{
		//			model.addAttribute("code", ticketData.get(i).getCode());
		//			model.addAttribute("name", passData.get(i).getName());
		//			model.addAttribute("surname", passData.get(i).getSurname());
		//			model.addAttribute("numberSeat", ticketData.get(i).getNumberSeat());
		//			logger.info("{}", passData.get(i).getName());
		//		}
		model1.put("ticketData", ticketData);
		model2.put("passengerData", passData);
		logger.info("sono sulla web page");
		return ControllerConstants.Views.Pages.ShowTicket.StoreFinderShowTicketZ;

	}


	@RequestMapping(value = "/addTicket", method = RequestMethod.POST)
	public String submit(@Valid
	@ModelAttribute("ticket")
	final TicketData ticketData, final BindingResult result, final ModelMap model)
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

		final TicketModel ticket = modelservice.create(TicketModel.class);

		//ticket.setCode(RandomStringUtils.randomAlphanumeric(12));
		//ticket.setNumberSeat(RandomStringUtils.randomAlphanumeric(3));

		//return "ticketView";

		return ControllerConstants.Views.Pages.SubmitTicket.StoreFinderSubmitTicketZ;
	}

}
