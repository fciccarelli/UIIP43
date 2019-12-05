package it.uiip.airport.core.job.impl;

import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.springframework.beans.factory.annotation.Required;

public class SendConfirmationJob extends AbstractJobPerformable<CronJobModel> {

    private EmailService emailService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        return null;
    }


    public EmailService getEmailService() {
        return emailService;
    }
    @Required
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }


}
