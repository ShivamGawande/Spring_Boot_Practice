package com.shivam.rest_api.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserRequestDto;
import com.shivam.rest_api.entity.UserReg;
import com.shivam.rest_api.service.UserRegService;

@RestController
public class UserRegControllor {
	
	@Autowired
	UserRegService userRegService;
	
	@PostMapping(path="/addUser",consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> addUser(@RequestBody UserRequestDto dto) {
		String result=userRegService.addUser(dto);
		if(result!=null) {
			return new ResponseEntity<String>(result, HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("Email id Already Existed, try with new one", HttpStatus.OK);
		}
	}
	
	//@GetMapping(path="/getUser/{City}",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	@GetMapping(path="/getUser",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> getUserByCityAndGender(@RequestParam String City,@RequestParam(required = false) String gender){
		List<UserReg> list=userRegService.getUserByCityAndGender(City, gender);
		if(list.isEmpty()) {
			String result="Record not found plese enter valid info";
			System.out.println(result);
			return new ResponseEntity<String>(result, HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(list,HttpStatus.OK);
		}
	}
}
