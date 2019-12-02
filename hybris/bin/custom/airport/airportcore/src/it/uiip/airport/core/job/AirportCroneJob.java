/**
 *
 */
package it.uiip.airport.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.time.LocalDate;

import org.apache.commons.lang.RandomStringUtils;

import it.uiip.airport.core.model.FlightModel;


/**
 * @author fabiosessa
 *
 */
public class AirportCroneJob extends AbstractJobPerformable<CronJobModel>
{


	@Override
	public PerformResult perform(final CronJobModel airportCroneJob)
	{
		// XXX Auto-generated method stub
		final LocalDate today = LocalDate.now();
		final String day = today.getDayOfWeek().name();
		final String code = RandomStringUtils.randomAlphanumeric(12);
		try
		{

			final FlightModel flight = modelService.create(FlightModel.class);
			flight.setCode(code);
			flight.setDayWeek(day);
			flight.setDepartureTime("13:00:00");
			flight.setTimeArrival("15:00:00");
			modelService.save(flight);
		}
		catch (final Exception e)
		{
			System.out.println("error in AirportcronJob:control flight set");
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

}
