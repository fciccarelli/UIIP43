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

import it.uiip.airport.core.model.FlightModel;


/**
 * @author Luigi
 *
 *         Scrivere un job che, schedulato ad un dato orario, crei un Flight che abbia come attributi: - code (random
 *         alpha number) - dayWeek (sempre il giorno corrente) - departureTime (orario prefissato) - timeArrival (orario
 *         prefissato)
 *
 */
public class MyJob extends AbstractJobPerformable<CronJobModel>
{

	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{

		try {
			final FlightModel flightModel = modelService.create(FlightModel.class);

   		flightModel.setCode(getAlphaNumericString());

			// ALTERNATIVA STRINGA RANDOM
   		//flightModel.setCode(RandomStringUtils.randomAlphanumeric(12));

   		flightModel.setDayWeek(LocalDate.now().getDayOfWeek().name());
   		flightModel.setDepartureTime("12:00:00");
   		flightModel.setTimeArrival("18:00:00");

			modelService.save(flightModel);

   		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
	}


	public String getAlphaNumericString()
	{
		final int n = 12;
		String randomString;
		final String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		final StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++)
		{
			// generate a random number between 0 to AlphaNumericString variable length
			final int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}
		return randomString = sb.toString();
	}


}
