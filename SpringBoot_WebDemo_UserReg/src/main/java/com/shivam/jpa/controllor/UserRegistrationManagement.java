package com.shivam.jpa.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserRegistrationManagement {
	
	@RequestMapping("/register")
	public String loadUserRegisterForm() {
		// configuring jsp file name, which has to be loaded
		return "registration";
	}
	
	@RequestMapping(path = "user/register",method = RequestMethod.POST)
	public ModelAndView userRegister(HttpServletRequest request) {
		// logic for reading data from Request
		String fullName=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String pass=request.getParameter("pwd");
		
		System.out.println(fullName);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(pass);
		
	    //  TODO :  Pass This Data to Service Layer 
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", "User Registered Successfully for: "+email);
		return mv;
	}
}
