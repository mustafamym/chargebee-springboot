package com.uber.cb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
	
	@GetMapping("/api/test/user")

	public String userAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/api/test/pm")

	public String projectManagementAccess() {
		return ">>> Project Management Board";
	}
	
	@GetMapping("/api/test/admin")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}