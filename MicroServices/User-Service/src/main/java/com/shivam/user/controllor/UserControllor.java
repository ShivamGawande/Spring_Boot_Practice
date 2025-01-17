package com.shivam.user.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.user.dto.UserCredentials;
import com.shivam.user.dto.UserRequuestDTO;
import com.shivam.user.entity.UserEntity;
import com.shivam.user.service.UserService;

@RestController
public class UserControllor {
	
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> userRegister(@RequestBody UserRequuestDTO dto){
		String result =service.addUser(dto);
		if(result!=null) {
			return new ResponseEntity<String>(result, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("Please try with different id it is already registered", HttpStatus.OK);
		}
	}
	
	@PostMapping("/login")
	public UserEntity login(@RequestBody UserCredentials credentials) {
		return service.validCredentials(credentials);
	}
}
