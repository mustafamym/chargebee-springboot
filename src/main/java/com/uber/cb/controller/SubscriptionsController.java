package com.uber.cb.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chargebee.models.HostedPage;

import com.uber.cb.constant.AppConstant;
import com.uber.cb.model.CbSubsNewRequestDto;
import com.uber.cb.model.CbSubsUpdateRequestDto;
import com.uber.cb.service.SubscriptionsService;

import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "/api" + AppConstant.API_VERSION + "/payments", produces = { "application/json" })
public class SubscriptionsController {
	
	@Autowired
	SubscriptionsService subscriptionsService;
	
	@PostMapping("/checkout/new/subscription")
	public ResponseEntity<?>  getCheckoutNewSubscription(@RequestBody CbSubsNewRequestDto  cbSubsNewRequestDto) {
		LinkedHashMap<String, Object> apiResponse=subscriptionsService.checkoutNewSubscription(cbSubsNewRequestDto);
		
		return new ResponseEntity<Object>(apiResponse, new HttpHeaders(), HttpStatus.OK);

	}
	
	@PostMapping("/upgrade-or-downgrade/subscription")
	public ResponseEntity<?>  upgradeOrDowngradeSubscription(@RequestBody CbSubsUpdateRequestDto  chargeePLanUpdateRequest) {
		LinkedHashMap<String, Object> apiResponse=subscriptionsService.upgradeOrDowngradeSubscription(chargeePLanUpdateRequest);
		
		return new ResponseEntity<Object>(apiResponse, new HttpHeaders(), HttpStatus.OK);

	}
}
