package com.uber.cb.service;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Service;

import com.chargebee.Environment;
import com.chargebee.Result;
import com.chargebee.models.HostedPage;
import com.uber.cb.model.CbSubsNewRequestDto;
import com.uber.cb.model.CbSubsUpdateRequestDto;

import reactor.core.publisher.Mono;

@Service
public class SubscriptionsServiceImp implements SubscriptionsService {
	
	private LinkedHashMap<String, Object> apiResponse;
	
	@Override
	public LinkedHashMap<String, Object> checkoutNewSubscription(CbSubsNewRequestDto cbSubsNewRequestDto) {
		
		apiResponse = new LinkedHashMap<String, Object>();
		

		Environment.configure("uberhandyman-test","test_r9mUYUzar4cuBjrc9nFwv8dr1gRVEuo0V");
		Result result;
		try {
			result = HostedPage.checkoutNew()
					.customerEmail(cbSubsNewRequestDto.getCustomerEmail())
					.customerFirstName(cbSubsNewRequestDto.getCustomerFirstName())
					.customerLastName(cbSubsNewRequestDto.getCustomerLastName())
					.customerLocale(cbSubsNewRequestDto.getCustomerLocale())
					.customerPhone(cbSubsNewRequestDto.getCustomerPhone())
					.subscriptionPlanId(cbSubsNewRequestDto.getSubscriptionPlanId())
					.billingAddressFirstName(cbSubsNewRequestDto.getCustomerFirstName())
					.billingAddressLastName(cbSubsNewRequestDto.getCustomerLastName())
					.billingAddressLine1(cbSubsNewRequestDto.getBillingAddressLine1())
					.billingAddressCity(cbSubsNewRequestDto.getBillingAddressCity())
					.billingAddressState(cbSubsNewRequestDto.getBillingAddressState())
					.billingAddressZip(cbSubsNewRequestDto.getBillingAddressZip())
					.billingAddressCountry(cbSubsNewRequestDto.getBillingAddressCountry()).request();
			HostedPage hostedPage = result.hostedPage();
			
			apiResponse.put("status", Boolean.TRUE);
			apiResponse.put("url", hostedPage.url());

			return apiResponse;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public LinkedHashMap<String, Object> upgradeOrDowngradeSubscription(
			CbSubsUpdateRequestDto updateRequest) {
		Environment.configure("uberhandyman-test","test_r9mUYUzar4cuBjrc9nFwv8dr1gRVEuo0V");
		apiResponse = new LinkedHashMap<String, Object>();
		try {
		Result result = HostedPage.checkoutExisting()
			.subscriptionId(updateRequest.getSubscriptionId())
			.subscriptionPlanId(updateRequest.getSubscriptionPlanId())
			.request();
		HostedPage hostedPage = result.hostedPage();
		
		apiResponse.put("status", Boolean.TRUE);
		apiResponse.put("url", hostedPage.url());

		return apiResponse;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}


}
