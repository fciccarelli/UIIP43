/**
 *
 */
package it.uiip.airport.core.job.impl;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.time.LocalDate;

import org.apache.commons.lang.RandomStringUtils;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author pasop
 *
 */
public class DefaultAirportCronJob extends AbstractJobPerformable<CronJobModel>
{
	private static final int LENGTH_ALPHANUMERIC_CODE = 12;

	@Override
	public PerformResult perform(final CronJobModel arg0)
	{
		// XXX Auto-generated method stub
		try
		{

			final FlightModel flight = modelService.create(FlightModel.class);

			flight.setCode(RandomStringUtils.randomAlphanumeric(LENGTH_ALPHANUMERIC_CODE));
			flight.setDayWeek(LocalDate.now().getDayOfWeek().name());
			flight.setDepartureTime("10:00:00");
			flight.setTimeArrival("12:00:00");

			modelService.save(flight);

			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

		}
		catch (final Exception e)
		{

			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
	}

}
