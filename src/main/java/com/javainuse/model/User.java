package com.javainuse.model;

import com.javainuse.frontModel.User.UserModel;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String fullname;
	@Column
	private String email;
	@Column
	private String pic;
	@Column
	private String occupation;
	@Column
	private String companyName;
	@Column
	private String phone;
	@Column
	private String address_addressLine;
	@Column
	private String address_city;
	@Column
	private String address_state;
	@Column
	private String address_postCode;
	@Column
	private String socialNetworks_linkedIn;
	@Column
	private String socialNetworks_facebook;
	@Column
	private String socialNetworks_twitter;
	@Column
	private String socialNetworks_instagram;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String website;
	@Column
	private String language;
	@Column
	private String timeZone;
	@Column
	private Boolean communication_email;
	@Column
	private Boolean communication_sms;
	@Column
	private Boolean communication_phone;
	@Column
	private Boolean emailSettings_emailNotification;
	@Column
	private Boolean emailSettings_sendCopyToPersonalEmail;
	@Column
	private Boolean emailSettings_activityRelatesEmail_youHaveNewNotifications;
	@Column
	private Boolean emailSettings_activityRelatesEmail_youAreSentADirectMessage;
	@Column
	private Boolean emailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection;
	@Column
	private Boolean emailSettings_activityRelatesEmail_uponNewOrder;
	@Column
	private Boolean emailSettings_activityRelatesEmail_newMembershipApproval;
	@Column
	private Boolean emailSettings_activityRelatesEmail_memberRegistration;
	@Column
	private Boolean newsAboutKeenthemesProductsAndFeatureUpdates;
	@Column
	private Boolean tipsOnGettingMoreOutOfKeen;
	@Column
	private Boolean thingsYouMissedSindeYouLastLoggedIntoKeen;
	@Column
	private Boolean newsAboutMetronicOnPartnerProductsAndOtherServices;
	@Column
	private Boolean tipsOnMetronicBusinessProducts;

	public User() {
	}

	public User(String password, String fullname, String email) {
		this.password = password;
		this.fullname = fullname;
		this.email = email;
	}



	public User(UserModel user, String password) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.fullname = user.getFullname();
		this.password = password;
		this.email = user.getEmail();
		this.pic = user.getPic();
		this.occupation = user.getOccupation();
		this.companyName = user.getCompanyName();
		this.phone = user.getPhone();
		this.address_addressLine = user.getAddress().getAdressLine();
		this.address_city = user.getAddress().getCity();
		this.address_postCode = user.getAddress().getPostCode();
		this.address_state = user.getAddress().getState();
		this.socialNetworks_facebook = user.getSocialNetworks().getFacebook();
		this.socialNetworks_instagram = user.getSocialNetworks().getInstagram();
		this.socialNetworks_twitter = user.getSocialNetworks().getTwitter();
		this.socialNetworks_linkedIn = user.getSocialNetworks().getLinkedIn();
		this.firstname = user.getFirstname();
		this.lastname = user.getLastname();
		this.language = user.getLanguage();
		this.timeZone = user.getTimeZone();
		this.website = user.getWebsite();
		this.communication_email = user.getCommunication().getEmail();
		this.communication_phone = user.getCommunication().getPhone();
		this.communication_sms = user.getCommunication().getSms();
		this.emailSettings_activityRelatesEmail_memberRegistration = user.getEmailSettings().getActivityRelatesEmail().getMemberRegistration();
		this.emailSettings_activityRelatesEmail_newMembershipApproval = user.getEmailSettings().getActivityRelatesEmail().getNewMembershipApproval();
		this.emailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection = user.getEmailSettings().getActivityRelatesEmail().getSomeoneAddsYouAsAsAConnection();
		this.emailSettings_activityRelatesEmail_uponNewOrder = user.getEmailSettings().getActivityRelatesEmail().getUponNewOrder();
		this.emailSettings_activityRelatesEmail_youAreSentADirectMessage = user.getEmailSettings().getActivityRelatesEmail().getYouAreSentADirectMessage();
		this.emailSettings_activityRelatesEmail_youHaveNewNotifications = user.getEmailSettings().getActivityRelatesEmail().getYouHaveNewNotifications();
		this.emailSettings_emailNotification = user.getEmailSettings().getEmailNotification();
		this.emailSettings_sendCopyToPersonalEmail = user.getEmailSettings().getSendCopyToPersonalEmail();
		this.newsAboutKeenthemesProductsAndFeatureUpdates = user.getEmailSettings().getUpdatesFromKeenthemes().getNewsAboutKeenthemesProductsAndFeatureUpdates();
		this.newsAboutMetronicOnPartnerProductsAndOtherServices = user.getEmailSettings().getUpdatesFromKeenthemes().getNewsAboutMetronicOnPartnerProductsAndOtherServices();
		this.tipsOnGettingMoreOutOfKeen = user.getEmailSettings().getUpdatesFromKeenthemes().getTipsOnGettingMoreOutOfKeen();
		this.tipsOnMetronicBusinessProducts = user.getEmailSettings().getUpdatesFromKeenthemes().getTipsOnMetronicBusinessProducts();
		this.thingsYouMissedSindeYouLastLoggedIntoKeen = user.getEmailSettings().getUpdatesFromKeenthemes().getThingsYouMissedSindeYouLastLoggedIntoKeen();
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() { return password; }

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress_addressLine() {
		return address_addressLine;
	}

	public void setAddress_addressLine(String address_addressLine) {
		this.address_addressLine = address_addressLine;
	}

	public String getAddress_city() {
		return address_city;
	}

	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}

	public String getAddress_state() {
		return address_state;
	}

	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}

	public String getAddress_postCode() {
		return address_postCode;
	}

	public void setAddress_postCode(String address_postCode) {
		this.address_postCode = address_postCode;
	}

	public String getSocialNetworks_linkedIn() {
		return socialNetworks_linkedIn;
	}

	public void setSocialNetworks_linkedIn(String socialNetworks_linkedIn) {
		this.socialNetworks_linkedIn = socialNetworks_linkedIn;
	}

	public String getSocialNetworks_facebook() {
		return socialNetworks_facebook;
	}

	public void setSocialNetworks_facebook(String socialNetworks_facebook) {
		this.socialNetworks_facebook = socialNetworks_facebook;
	}

	public String getSocialNetworks_twitter() {
		return socialNetworks_twitter;
	}

	public void setSocialNetworks_twitter(String socialNetworks_twitter) {
		this.socialNetworks_twitter = socialNetworks_twitter;
	}

	public String getSocialNetworks_instagram() {
		return socialNetworks_instagram;
	}

	public void setSocialNetworks_instagram(String socialNetworks_instagram) {
		this.socialNetworks_instagram = socialNetworks_instagram;
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

	public Boolean getCommunication_email() {
		return communication_email;
	}

	public void setCommunication_email(Boolean communication_email) {
		this.communication_email = communication_email;
	}

	public Boolean getCommunication_sms() {
		return communication_sms;
	}

	public void setCommunication_sms(Boolean communication_sms) {
		this.communication_sms = communication_sms;
	}

	public Boolean getCommunication_phone() {
		return communication_phone;
	}

	public void setCommunication_phone(Boolean communication_phone) {
		this.communication_phone = communication_phone;
	}

	public Boolean getEmailSettings_emailNotification() {
		return emailSettings_emailNotification;
	}

	public void setEmailSettings_emailNotification(Boolean emailSettings_emailNotification) {
		this.emailSettings_emailNotification = emailSettings_emailNotification;
	}

	public Boolean getEmailSettings_sendCopyToPersonalEmail() {
		return emailSettings_sendCopyToPersonalEmail;
	}

	public void setEmailSettings_sendCopyToPersonalEmail(Boolean emailSettings_sendCopyToPersonalEmail) {
		this.emailSettings_sendCopyToPersonalEmail = emailSettings_sendCopyToPersonalEmail;
	}

	public Boolean getEmailSettings_activityRelatesEmail_youHaveNewNotifications() {
		return emailSettings_activityRelatesEmail_youHaveNewNotifications;
	}

	public void setEmailSettings_activityRelatesEmail_youHaveNewNotifications(Boolean emailSettings_activityRelatesEmail_youHaveNewNotifications) {
		this.emailSettings_activityRelatesEmail_youHaveNewNotifications = emailSettings_activityRelatesEmail_youHaveNewNotifications;
	}

	public Boolean getEmailSettings_activityRelatesEmail_youAreSentADirectMessage() {
		return emailSettings_activityRelatesEmail_youAreSentADirectMessage;
	}

	public void setEmailSettings_activityRelatesEmail_youAreSentADirectMessage(Boolean emailSettings_activityRelatesEmail_youAreSentADirectMessage) {
		this.emailSettings_activityRelatesEmail_youAreSentADirectMessage = emailSettings_activityRelatesEmail_youAreSentADirectMessage;
	}

	public Boolean getEmailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection() {
		return emailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection;
	}

	public void setEmailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection(Boolean emailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection) {
		this.emailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection = emailSettings_activityRelatesEmail_someoneAddsYouAsAsAConnection;
	}

	public Boolean getEmailSettings_activityRelatesEmail_uponNewOrder() {
		return emailSettings_activityRelatesEmail_uponNewOrder;
	}

	public void setEmailSettings_activityRelatesEmail_uponNewOrder(Boolean emailSettings_activityRelatesEmail_uponNewOrder) {
		this.emailSettings_activityRelatesEmail_uponNewOrder = emailSettings_activityRelatesEmail_uponNewOrder;
	}

	public Boolean getEmailSettings_activityRelatesEmail_newMembershipApproval() {
		return emailSettings_activityRelatesEmail_newMembershipApproval;
	}

	public void setEmailSettings_activityRelatesEmail_newMembershipApproval(Boolean emailSettings_activityRelatesEmail_newMembershipApproval) {
		this.emailSettings_activityRelatesEmail_newMembershipApproval = emailSettings_activityRelatesEmail_newMembershipApproval;
	}

	public Boolean getEmailSettings_activityRelatesEmail_memberRegistration() {
		return emailSettings_activityRelatesEmail_memberRegistration;
	}

	public void setEmailSettings_activityRelatesEmail_memberRegistration(Boolean emailSettings_activityRelatesEmail_memberRegistration) {
		this.emailSettings_activityRelatesEmail_memberRegistration = emailSettings_activityRelatesEmail_memberRegistration;
	}

	public Boolean getNewsAboutKeenthemesProductsAndFeatureUpdates() {
		return newsAboutKeenthemesProductsAndFeatureUpdates;
	}

	public void setNewsAboutKeenthemesProductsAndFeatureUpdates(Boolean newsAboutKeenthemesProductsAndFeatureUpdates) {
		this.newsAboutKeenthemesProductsAndFeatureUpdates = newsAboutKeenthemesProductsAndFeatureUpdates;
	}

	public Boolean getTipsOnGettingMoreOutOfKeen() {
		return tipsOnGettingMoreOutOfKeen;
	}

	public void setTipsOnGettingMoreOutOfKeen(Boolean tipsOnGettingMoreOutOfKeen) {
		this.tipsOnGettingMoreOutOfKeen = tipsOnGettingMoreOutOfKeen;
	}

	public Boolean getThingsYouMissedSindeYouLastLoggedIntoKeen() {
		return thingsYouMissedSindeYouLastLoggedIntoKeen;
	}

	public void setThingsYouMissedSindeYouLastLoggedIntoKeen(Boolean thingsYouMissedSindeYouLastLoggedIntoKeen) {
		this.thingsYouMissedSindeYouLastLoggedIntoKeen = thingsYouMissedSindeYouLastLoggedIntoKeen;
	}

	public Boolean getNewsAboutMetronicOnPartnerProductsAndOtherServices() {
		return newsAboutMetronicOnPartnerProductsAndOtherServices;
	}

	public void setNewsAboutMetronicOnPartnerProductsAndOtherServices(Boolean newsAboutMetronicOnPartnerProductsAndOtherServices) {
		this.newsAboutMetronicOnPartnerProductsAndOtherServices = newsAboutMetronicOnPartnerProductsAndOtherServices;
	}

	public Boolean getTipsOnMetronicBusinessProducts() {
		return tipsOnMetronicBusinessProducts;
	}

	public void setTipsOnMetronicBusinessProducts(Boolean tipsOnMetronicBusinessProducts) {
		this.tipsOnMetronicBusinessProducts = tipsOnMetronicBusinessProducts;
	}
}