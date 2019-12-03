/**
 *
 */
package it.uiip.airport.core.cronjob.impl;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.time.LocalDate;

import org.apache.commons.lang.RandomStringUtils;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author sdeli
 *
 */
public class MyJob extends AbstractJobPerformable<CronJobModel>
{

	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{



		try
		{

			final FlightModel flight = modelService.create(FlightModel.class);
		flight.setCode(RandomStringUtils.randomAlphanumeric(12));
		flight.setDayWeek(LocalDate.now().getDayOfWeek().name());
		flight.setDepartureTime("12:00:00");
		flight.setTimeArrival("14:30:00");

			modelService.save(flight);
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

		}
		catch (final Exception e)
		{
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}

	}


}