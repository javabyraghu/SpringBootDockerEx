package com.app.raghu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {

	@GetMapping("/welcome/{user}")
	public ResponseEntity<String> showMessage(
			@PathVariable String user) {
		return ResponseEntity.ok("Welcome to User : " + user);
		
	}
}
