package com.javainuse.frontModel.User;

public class SocialNetworksModel {

    private String linkedIn;
    private String facebook;
    private String twitter;
    private String instagram;

    public SocialNetworksModel(String linkedIn, String facebook, String twitter, String instagram) {
        this.linkedIn = linkedIn;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}
