package com.javainuse.frontModel.User;

public class ActivityRelatesEmail {

    private Boolean youHaveNewNotifications;
    private Boolean youAreSentADirectMessage;
    private Boolean someoneAddsYouAsAsAConnection;
    private Boolean uponNewOrder;
    private Boolean newMembershipApproval;
    private Boolean memberRegistration;

    public ActivityRelatesEmail(Boolean youHaveNewNotifications, Boolean youAreSentADirectMessage, Boolean someoneAddsYouAsAsAConnection, Boolean uponNewOrder, Boolean newMembershipApproval, Boolean memberRegistration) {
        this.youHaveNewNotifications = youHaveNewNotifications;
        this.youAreSentADirectMessage = youAreSentADirectMessage;
        this.someoneAddsYouAsAsAConnection = someoneAddsYouAsAsAConnection;
        this.uponNewOrder = uponNewOrder;
        this.newMembershipApproval = newMembershipApproval;
        this.memberRegistration = memberRegistration;
    }

    public Boolean getYouHaveNewNotifications() {
        return youHaveNewNotifications;
    }

    public void setYouHaveNewNotifications(Boolean youHaveNewNotifications) {
        this.youHaveNewNotifications = youHaveNewNotifications;
    }

    public Boolean getYouAreSentADirectMessage() {
        return youAreSentADirectMessage;
    }

    public void setYouAreSentADirectMessage(Boolean youAreSentADirectMessage) {
        this.youAreSentADirectMessage = youAreSentADirectMessage;
    }

    public Boolean getSomeoneAddsYouAsAsAConnection() {
        return someoneAddsYouAsAsAConnection;
    }

    public void setSomeoneAddsYouAsAsAConnection(Boolean someoneAddsYouAsAsAConnection) {
        this.someoneAddsYouAsAsAConnection = someoneAddsYouAsAsAConnection;
    }

    public Boolean getUponNewOrder() {
        return uponNewOrder;
    }

    public void setUponNewOrder(Boolean uponNewOrder) {
        this.uponNewOrder = uponNewOrder;
    }

    public Boolean getNewMembershipApproval() {
        return newMembershipApproval;
    }

    public void setNewMembershipApproval(Boolean newMembershipApproval) {
        this.newMembershipApproval = newMembershipApproval;
    }

    public Boolean getMemberRegistration() {
        return memberRegistration;
    }

    public void setMemberRegistration(Boolean memberRegistration) {
        this.memberRegistration = memberRegistration;
    }
}
