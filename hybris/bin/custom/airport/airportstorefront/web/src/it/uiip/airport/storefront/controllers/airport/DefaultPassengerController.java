/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.facades.data.PassengerData;
import it.uiip.airport.storefront.controllers.ControllerConstants;


/**
 * @author fabiosessa
 *
 */
@Controller
@RequestMapping(value = "/passengerController")
public class DefaultPassengerController extends AbstractPageController
{
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

		return ControllerConstants.Views.Pages.NewPassenger.RegisterOK;
	}

}
