package com.shivam.rest_api.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.shivam.rest_api.dto.UserRequestDTO;

public interface UserService {
	String validateUser(@RequestBody UserRequestDTO dto,String host);
}
