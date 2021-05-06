package com.javainuse.frontModel.User;

public class EmailSettings {

    private Boolean emailNotification;
    private Boolean sendCopyToPersonaleEmail;
    private ActivityRelatesEmail activityRelatesEmail;
    private UpdatesFromKeenthemes updatesFromKeenthemes;

    public EmailSettings(Boolean emailNotification, Boolean sendCopyToPersonaleEmail, ActivityRelatesEmail activityRelatesEmail, UpdatesFromKeenthemes updatesFromKeenthemes) {
        this.emailNotification = emailNotification;
        this.sendCopyToPersonaleEmail = sendCopyToPersonaleEmail;
        this.activityRelatesEmail = activityRelatesEmail;
        this.updatesFromKeenthemes = updatesFromKeenthemes;
    }

    public Boolean getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    public Boolean getSendCopyToPersonaleEmail() {
        return sendCopyToPersonaleEmail;
    }

    public void setSendCopyToPersonaleEmail(Boolean sendCopyToPersonaleEmail) {
        this.sendCopyToPersonaleEmail = sendCopyToPersonaleEmail;
    }

    public ActivityRelatesEmail getActivityRelatesEmail() {
        return activityRelatesEmail;
    }

    public void setActivityRelatesEmail(ActivityRelatesEmail activityRelatesEmail) {
        this.activityRelatesEmail = activityRelatesEmail;
    }

    public UpdatesFromKeenthemes getUpdatesFromKeenthemes() {
        return updatesFromKeenthemes;
    }

    public void setUpdatesFromKeenthemes(UpdatesFromKeenthemes updatesFromKeenthemes) {
        this.updatesFromKeenthemes = updatesFromKeenthemes;
    }
}
