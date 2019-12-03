/**
 *
 */
package it.uiip.airport.core.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.time.LocalDate;

import org.apache.commons.lang.RandomStringUtils;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author SimonaBranca
 *
 */
public class FlightJob extends AbstractJobPerformable<CronJobModel>
{

	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		final FlightModel flight = modelService.create(FlightModel.class);
		final LocalDate today = LocalDate.now();
		final String dayWeek = today.getDayOfWeek().name();
		final String code = RandomStringUtils.randomAlphanumeric(12);
		try
		{
			flight.setCode(code);
			flight.setDayWeek(dayWeek);
			flight.setDepartureTime("14:00:00");
			flight.setTimeArrival("16:00:00");

			modelService.save(flight);

		}
		catch (final Exception e)
		{

			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

}
