package com.uber.cb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CbSubsUpdateRequestDto {
	
	private String subscriptionId;
	
	private String subscriptionPlanId;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionPlanId() {
		return subscriptionPlanId;
	}

	public void setSubscriptionPlanId(String subscriptionPlanId) {
		this.subscriptionPlanId = subscriptionPlanId;
	}
	
    

}
