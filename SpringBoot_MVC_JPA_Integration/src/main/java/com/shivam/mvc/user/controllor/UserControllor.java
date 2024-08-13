package com.shivam.mvc.user.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shivam.mvc.user.service.UserService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class UserControllor {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public String loadHomePage() {
		//returning home page
		return "home";
	}
	
	@RequestMapping("/Userhome")
	public String loadUserHomePage() {
		//returning home page
		return "Userhome";
	}
	
	@RequestMapping("/Userregister")
	public String loadRegisterPage() {
		//register form
		return "Userregister";
	}
	
	@RequestMapping("user/Userlogin")
	public String loadLoginPage() {
		//login form
		return "Userlogin";
	}
	
	@RequestMapping("/Userlogin")
	public String reLoadLoginPage() {
		//login form
		return "Userlogin";
	}
	
	@RequestMapping("user/update")
	public String loadUpdatePasswordPage() {
		//update password form
		return "UpdatePassword";
	}
	
	@RequestMapping(path = "user/register",method = RequestMethod.POST)
	public ModelAndView getUserDetails(HttpServletRequest req ) {
		String fName=req.getParameter("fname");
		String lName=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String pass=req.getParameter("pass");
		
		System.out.println(gender);
		//Service layer Integration
		String response=null;
		response=userService.registerUserInfo(fName, lName, email, mobile, gender, pass);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Usersuccess");
		mv.addObject("response", response+" : "+email);
		return mv;
	}
	
	@RequestMapping(path ="user/login" , method=RequestMethod.POST)
	public ModelAndView getLoginDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		ModelAndView mv=new ModelAndView();
		String response=null;
		
		response=userService.validateUser(email, pass);
		if(response.contains("successfully log in ")) {
			mv.setViewName("UsersuccessLogin");
			mv.addObject("response", response);
			return mv;
		}
		else {
			mv.setViewName("msg");
			mv.addObject("response", response);
			return mv;
		}
	}
	
	@RequestMapping(path = "user/update/password",method=RequestMethod.POST)
	public ModelAndView updateUserPassword(HttpServletRequest req) {
		String uName=req.getParameter("uname");
		String curr_pass=req.getParameter("cpass");
		String new_pass=req.getParameter("npass");
		String r_pass=req.getParameter("rpass");
		String response=userService.updateUserPassword(uName, curr_pass, new_pass, r_pass);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Usersuccess");
		mv.addObject("response", response);
		return mv;
	}
	
	
	
}
