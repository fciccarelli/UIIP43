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
 * @author aDeAngelis creare un job che schedulato ad un determinato orario, crei un Flinght che abbia come attributo
 *         -code(random alpha number length 12) -day week (sempre il giorno corrente) -departtureTime(un giorno
 *         prefissato) -timeArrival (un orario prefissato)
 *
 */
public class AirportJob extends AbstractJobPerformable<CronJobModel>
{


	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{
		final FlightModel flight = modelService.create(FlightModel.class);
		final String generetedCode = RandomStringUtils.randomAlphanumeric(12);
		final LocalDate today = LocalDate.now();
		final String day = today.getDayOfWeek().name();

		try
		{
			flight.setCode(generetedCode);
			flight.setDayWeek(day);
			flight.setDepartureTime("13:13:00");
			flight.setTimeArrival("errore in airportJob");
			modelService.saveAll(FlightModel.class);

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			System.out.println("");
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
	}



	}

}
