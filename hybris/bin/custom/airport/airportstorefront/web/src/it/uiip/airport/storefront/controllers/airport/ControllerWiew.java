/**
 *
 */
package it.uiip.airport.storefront.controllers.airport;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uiip.airport.storefront.controllers.ControllerConstants;


/**
 * @author fabiosessa
 *
 */
@Controller
@RequestMapping(value = "/controllerView")
public class ControllerWiew extends AbstractPageController
{
	private static final String PASSVIEW = "/new";

	@RequestMapping(value = PASSVIEW)
	public String viewPage()
	{


		return ControllerConstants.Views.Pages.NewPassenger.StoreNewPassenger;
	}

}
