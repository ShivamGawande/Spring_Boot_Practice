package com.shivam.rest_api.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWT_Controllor {

	@Autowired
	private JWT_Token_Manager tokenManager;
	
	@GetMapping("/create/token/{userId}")
	public String createToken(@PathVariable String userId) {
		return tokenManager.createToken(userId);
	}
	
	@GetMapping("/valid/token/{userId}")
	public boolean isValidTokenCo(@PathVariable String userId, @RequestHeader String token) {
		System.out.println("Token Got:  "+token);
		return tokenManager.isValidToken(userId, token);
	}
}
