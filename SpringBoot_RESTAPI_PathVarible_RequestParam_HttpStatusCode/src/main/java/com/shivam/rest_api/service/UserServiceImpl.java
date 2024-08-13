package com.shivam.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest_api.dto.UserDTO;
import com.shivam.rest_api.dto.UserEnDTO;
import com.shivam.rest_api.entity.User;
import com.shivam.rest_api.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo repo;

	@Override
	public String changePassword(String email, UserDTO dto) {
		String result="";
		if(repo.findById(email).isPresent()) {
			User user=repo.findById(email).get();
			if(user.getPass().equals(dto.getCurrentPass())) {
				user.setPass(dto.getNewPass());
				repo.save(user);
				result= "your password is updated: "+email;
			}
			else
				result=null;
		}
		else
			result=null;
		return result;
				
	}

	@Override
	public String addUser(UserEnDTO dto) {
		String result;
		User user=new User();
		user.setEmail(dto.getEmail());
		user.setFullName(dto.getFullName());
		user.setPass(dto.getPass());
		if(repo.findById(dto.getEmail()).isPresent()){
			result=null;
		}
		else {
			repo.save(user);
			result="User Info registered";
		}
		return result;
	}

}
