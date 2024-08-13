package com.shivam.rest_api.service;

import com.shivam.rest_api.dto.UserDTO;
import com.shivam.rest_api.dto.UserEnDTO;

public interface UserService {
	String changePassword( String email, UserDTO dto);

	String addUser(UserEnDTO dto);
}
