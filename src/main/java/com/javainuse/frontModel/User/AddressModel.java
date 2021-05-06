package com.javainuse.frontModel.User;

public class AddressModel {

    private String adressLine;
    private String city;
    private String state;
    private String postCode;

    public AddressModel(String adressLine, String city, String state, String postCode) {
        this.adressLine = adressLine;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
    }

    public String getAdressLine() {
        return adressLine;
    }

    public void setAdressLine(String adressLine) {
        this.adressLine = adressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
