/**
 *
 */
package it.uiip.airport.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;


/**
 * @author fabiosessa
 *
 */
public class SendConfirmationJob extends AbstractJobPerformable<CronJobModel>
{

	@Override
	public PerformResult perform(final CronJobModel sendConfirmationJob)
	{
		// XXX Auto-generated method stub
		try
		{

		}
		catch (final Exception e)
		{
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

}
