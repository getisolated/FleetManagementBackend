package com.javainuse.frontModel.User;

public class CommunicationModel {

    private Boolean email;
    private Boolean sms;
    private Boolean phone;

    public CommunicationModel(Boolean email, Boolean sms, Boolean phone) {
        this.email = email;
        this.sms = sms;
        this.phone = phone;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Boolean getSms() {
        return sms;
    }

    public void setSms(Boolean sms) {
        this.sms = sms;
    }

    public Boolean getPhone() {
        return phone;
    }

    public void setPhone(Boolean phone) {
        this.phone = phone;
    }
}
