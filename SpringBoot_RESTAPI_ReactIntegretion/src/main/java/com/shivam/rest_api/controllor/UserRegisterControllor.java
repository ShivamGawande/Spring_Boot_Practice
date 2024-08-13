package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserRequestDTO;
import com.shivam.rest_api.service.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Validated
public class UserRegisterControllor {
	
	@Autowired
	UserService userService;

	@PostMapping(path="/user/signup",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> userSignUp(@Valid @RequestBody UserRequestDTO dto) {
		ResponseEntity<String> response;
		try {
			response=userService.addUser(dto);
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			response= new  ResponseEntity<String> ("{\"status\":500,\"Something went wrong please try again\"}", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
		
	}
	
}
