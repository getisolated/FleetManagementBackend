package com.javainuse.frontModel.User;

import com.javainuse.model.User;
import com.javainuse.model.UserHasRole;
import com.javainuse.model.UserHasRoleKey;

import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

public class UserModel {

    private String username;

    private String fullname;

    private String email;

    private String pic;

    private ArrayList<Integer> roles;

    private String occupation;

    private String companyName;

    private String phone;

    private AddressModel address;

    private SocialNetworksModel socialNetworks;

    private String firstname;

    private String lastname;

    private String website;

    private String language;

    private String timeZone;

    private CommunicationModel communication;

    private EmailSettings emailSettings;

    public UserModel(User user, List<UserHasRole> userHasRoles) {
        this.username = user.getUsername();
        this.fullname = user.getFullname();
        this.email = user.getEmail();
        this.pic = user.getPic();
        this.roles = new ArrayList<>();
        for (UserHasRole userHasRole : userHasRoles) {
            this.roles.add(userHasRole.getId().getRole());
        }
        this.occupation = user.getOccupation();
        this.companyName = user.getCompanyName();
        this.phone = user.getPhone();
        this.address = new AddressModel(user.getAddress_addressLine(), user.getAddress_city(), user.getAddress_state(), user.getAddress_postCode());
        this.socialNetworks = new SocialNetworksModel(user.getSocialNetworks_linkedIn(),user.getSocialNetworks_facebook(),user.getSocialNetworks_twitter(),user.getSocialNetworks_instagram());
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.website = user.getWebsite();
        this.language = user.getLanguage();
        this.timeZone = user.getTimeZone();
        this.communication = new CommunicationModel(user.getCommunication_email(),user.getCommunication_sms(),user.getCommunication_phone());
        ActivityRelatesEmail activityRelatesEmail = new ActivityRelatesEmail(
                user.getEmailSettings_activityRelatesEmail_youHaveNewNotifications(),
                user.getEmailSettings_activityRelatesEmail_youAreSentADirectMessage(),
                user.getEmailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection(),
                user.getEmailSettings_activityRelatesEmail_uponNewOrder(),
                user.getEmailSettings_activityRelatesEmail_newMembershipApproval(),
                user.getEmailSettings_activityRelatesEmail_memberRegistration());
        UpdatesFromKeenthemes updatesFromKeenthemes = new UpdatesFromKeenthemes(
                user.getNewsAboutKeenthemesProductsAndFeatureUpdates(),
                user.getTipsOnGettingMoreOutOfKeen(),
                user.getThingsYouMissedSindeYouLastLoggedIntoKeen(),
                user.getNewsAboutMetronicOnPartnerProductsAndOtherServices(),
                user.getTipsOnMetronicBusinessProducts()
        );
        this.emailSettings = new EmailSettings(
                user.getEmailSettings_emailNotification(),
                user.getEmailSettings_sendCopyToPersonalEmail(),
                activityRelatesEmail,
                updatesFromKeenthemes);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public ArrayList<Integer> getRole() {
        return roles;
    }

    public void setRole(ArrayList<Integer> roles) {
        this.roles = roles;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public SocialNetworksModel getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(SocialNetworksModel socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CommunicationModel getCommunication() {
        return communication;
    }

    public void setCommunication(CommunicationModel communication) {
        this.communication = communication;
    }

    public EmailSettings getEmailSettings() {
        return emailSettings;
    }

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }
}
