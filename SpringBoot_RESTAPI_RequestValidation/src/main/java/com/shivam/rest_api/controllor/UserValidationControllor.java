package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserRequestDTO;
import com.shivam.rest_api.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserValidationControllor {

	@Autowired
	UserService userService;
	
	@PostMapping("/createuser/validate")
	public String validateUser(@Valid @RequestBody UserRequestDTO dto,@RequestHeader(name="hostname")String hostname) {
		System.out.println(dto);
		System.out.println(hostname);
		String validateUser = userService.validateUser(dto,hostname);
		return validateUser;
	}
	
	@GetMapping("/get/emi")
    public int getEMIValue() {
        int value1 = 1000;
        int value2 = 0;
        return value1 / value2; // This will cause ArithmeticException
    }
}
