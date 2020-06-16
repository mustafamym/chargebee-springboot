package com.uber.cb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CbSubsNewRequestDto {
	
	private String subscriptionPlanId;
	
    private String customerEmail;
    
    private String customerFirstName;
    
    private String customerLastName;
    
    private String customerLocale;
    
    private String customerPhone;
    
    private String billingAddressLine1;
    
    private String billingAddressCity;
    
    private String billingAddressState;
    
    private String billingAddressZip;
    
    private String billingAddressCountry;

	public String getSubscriptionPlanId() {
		return subscriptionPlanId;
	}

	public void setSubscriptionPlanId(String subscriptionPlanId) {
		this.subscriptionPlanId = subscriptionPlanId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerLocale() {
		return customerLocale;
	}

	public void setCustomerLocale(String customerLocale) {
		this.customerLocale = customerLocale;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getBillingAddressLine1() {
		return billingAddressLine1;
	}

	public void setBillingAddressLine1(String billingAddressLine1) {
		this.billingAddressLine1 = billingAddressLine1;
	}

	public String getBillingAddressCity() {
		return billingAddressCity;
	}

	public void setBillingAddressCity(String billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}

	public String getBillingAddressState() {
		return billingAddressState;
	}

	public void setBillingAddressState(String billingAddressState) {
		this.billingAddressState = billingAddressState;
	}

	public String getBillingAddressZip() {
		return billingAddressZip;
	}

	public void setBillingAddressZip(String billingAddressZip) {
		this.billingAddressZip = billingAddressZip;
	}

	public String getBillingAddressCountry() {
		return billingAddressCountry;
	}

	public void setBillingAddressCountry(String billingAddressCountry) {
		this.billingAddressCountry = billingAddressCountry;
	}


}
