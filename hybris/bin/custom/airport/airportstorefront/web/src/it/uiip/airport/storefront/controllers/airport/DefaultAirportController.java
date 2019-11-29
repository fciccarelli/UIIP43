/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uiip.airport.facades.AirportFacade;
import it.uiip.airport.facades.data.AirportData;
import it.uiip.airport.storefront.controllers.ControllerConstants;


/**
 * @author sdeli
 *
 */
@Controller
@RequestMapping(value = "/airport")
public class DefaultAirportController extends AbstractPageController
{

	private static final String STORE_CODE_PATH_VARIABLE_PATTERN = "/airport";

	@Resource(name = "airportFacade")
	AirportFacade airportFacade;

	@RequestMapping(value = STORE_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String showAirport(@PathVariable("Code")
	final String code, final Model model)
	{
		final AirportData airportData = airportFacade.getAirportByCode(code);
		model.addAttribute("code", airportData.getCode());
		model.addAttribute("city", airportData.getCity());
		model.addAttribute("country", airportData.getCountry());
		model.addAttribute("nRunways", airportData.getNRunways());

		return ControllerConstants.Views.Pages.Airport.ShowAirport;
	}


}
