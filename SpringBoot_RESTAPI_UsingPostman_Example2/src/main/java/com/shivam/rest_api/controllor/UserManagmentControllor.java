package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.service.UserManagmentService;

@RestController
public class UserManagmentControllor {
	
	@Autowired
	UserManagmentService userManagmentService;
	
	@PostMapping(path = "user/create",consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public String createUser(@RequestBody UserRequestDto user) {
//		
		return userManagmentService.createUser(user);
	}
}
