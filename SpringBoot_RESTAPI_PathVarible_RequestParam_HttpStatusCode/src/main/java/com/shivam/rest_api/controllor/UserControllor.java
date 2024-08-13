package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserDTO;
import com.shivam.rest_api.dto.UserEnDTO;
import com.shivam.rest_api.service.UserService;


@RestController
public class UserControllor {

	@Autowired
	UserService userServiceo;
	
	@PutMapping("/changePassword/{email}")
	public ResponseEntity<String> changePassword(@PathVariable String email,@RequestBody UserDTO dto) {
		String result=userServiceo.changePassword(email, dto);
		if(result!=null) {
			return new ResponseEntity<String>(result, HttpStatus.CREATED);
		}
		else
		return new ResponseEntity<String>("Invalid Credential", HttpStatus.OK);
	}
	
	@PostMapping("/addUserReg")
	public ResponseEntity<String> addUser(@RequestBody UserEnDTO dto) {
		String result=userServiceo.addUser(dto);
		if(result!=null) {
			return new ResponseEntity<String>(result, HttpStatus.CREATED);
		}
		else
		return new ResponseEntity<String>("Email Id Alreday Present ,try with different one", HttpStatus.OK);
	}
}
