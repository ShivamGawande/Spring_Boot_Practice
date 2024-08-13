package com.shivam.rest_api.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest_api.dto.UserRequestDTO;
import com.shivam.rest_api.jwt.JWT_Token_Manager;
import com.shivam.rest_api.service.UserService;

@RestController
public class UserManagementControllor {
	
	@Autowired
	JWT_Token_Manager jwt_Token_Manager;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserService service;
	
	@PostMapping("/user/create")
	public ResponseEntity<String> userReg(@RequestBody UserRequestDTO dto){
		String result= service.userRegister(dto);
		if(result!=null) {
			return new ResponseEntity<String>(result,HttpStatus.CREATED);
		}
		else {
			
			return new ResponseEntity<String>("Email existed, Please Try with New One", HttpStatus.OK);
		}
	}
	
	@PostMapping("/user/login")
	public ResponseEntity<String> userLogin(@RequestBody com.shivam.rest_api.dto.UserCredentials userCredentials) {

		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
				userCredentials.getEmail(), userCredentials.getPassword());

		// try {
		authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		// }catch(BadCredentialsException ex) {
		// System.out.println("Bad Credentilas : "+ex.getMessage());
		// }

		// TODO : get all User Details :
		String token = this.jwt_Token_Manager.createToken(userCredentials.getEmail());

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Authorization", token);

		return new ResponseEntity<String>("Welcome to Home, Please find Details " + userCredentials.getEmail(),
				httpHeaders, HttpStatus.OK);

	}

	
}
