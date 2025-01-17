package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.entity.User;
import com.shivam.rest_api.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserManagementControllor {
	
	@Autowired
	UserService userService;
	
	@PostMapping(path = "/addUser",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> addUser(@Valid @RequestBody UserRequestDto dto){
		String response=userService.addUser(dto);
		if(response==null) {
			return new ResponseEntity<String>("Combination of Username and email already registered try with diiferent one", HttpStatus.OK);
		}
		else
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/getUser/{email}/{username}",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> findByEmailAndUsername(@PathVariable(name = "email")String email,@PathVariable(name = "username") String username){
		User user=userService.findByEmailAndUsername(email, username);
		if(user!=null) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		else
		return new ResponseEntity<String>("UserId not found", HttpStatus.BAD_REQUEST);
	}
}
