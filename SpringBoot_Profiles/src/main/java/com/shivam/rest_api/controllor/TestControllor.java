package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestControllor {
	
	@Value("${contact.email}")
	private String email;
	
	@GetMapping("/message")
	public String getMsg() {
		return "Mac book extreme is booked,please contact"+email;
	}
}
