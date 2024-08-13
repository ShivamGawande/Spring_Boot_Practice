package com.shivam.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.shivam.rest_api.dto.UserRequestDTO;
import com.shivam.rest_api.entity.User;
import com.shivam.rest_api.repository.UserRepo;

@Service
public class UserServiceIMPL implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public ResponseEntity<String> addUser(UserRequestDTO dto) {
		try {
		User user = new User();
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setAddress(dto.getAddress());
		user.setMailId(dto.getMailId());
		user.setPassword(dto.getPassword());
		user.setPhoneNumber(dto.getPhoneNumber());
		user.setPincode(dto.getPincode());
		userRepo.save(user);
		return new ResponseEntity<String> ("{\"status\":200,\"response\":\"User registered successfully\"}", HttpStatus.CREATED);
		}
		catch(DataIntegrityViolationException e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<String> ("{\"status\":500,\"response\":\"Combination of Email Id and Phone Number Already Present try with different One\"}", HttpStatus.INTERNAL_SERVER_ERROR);
		}
//		catch (MethodArgumentNotValidException e) {
//			System.out.println(e.getMessage());
//			return new ResponseEntity<String> ("{\"status\":500,\"response\":\"Plsese check Password Size must be greater than 8\"}", HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		
		
	}

}
