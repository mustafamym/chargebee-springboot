package com.uber.cb.service;

import java.util.LinkedHashMap;

import com.uber.cb.model.CbSubsNewRequestDto;
import com.uber.cb.model.CbSubsUpdateRequestDto;

public interface SubscriptionsService {
	
	LinkedHashMap<String, Object> checkoutNewSubscription(CbSubsNewRequestDto cbSubsNewRequestDto);
	
	LinkedHashMap<String, Object> upgradeOrDowngradeSubscription(CbSubsUpdateRequestDto updateRequest);
	
}
