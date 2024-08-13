package com.shivam.mvc.admin.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shivam.mvc.admin.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminControllor {
	
	//Integration or DI:-Injecting service in controllor class
	@Autowired
	AdminService adminService;
	
	@RequestMapping("adminlogin")
	public String loadAdminLoginForm() {
		//login form admin
		return "AdminLogin";
	}
	
	@RequestMapping("admin/search")
	public String loadSearchForm() {
		//search form
		return "Search";
	}
	
	@RequestMapping("admin/delete")
	public String loadDeleteForm() {
		//search form
		return "DeleteUser";
	}
	
	@RequestMapping(path = "admin/login",method=RequestMethod.POST)
	public ModelAndView getAdminLoginInfo(HttpServletRequest req) {
		//getting data from Adminlogin
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		//Sending data to Service Layer(Integration of service and Controllor)
		String response=adminService.validateAdminLogin(email, pass);
		
		//sending dynamic response
		if(response.contains("successfully login")) {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("AdminSuccessLogin");
			mv.addObject("response", response);
			return mv;
		}
		else {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("msg");
			mv.addObject("response", response);
			return mv;
		}
		
	}
	
	@RequestMapping(path = "admin/user/search", method = RequestMethod.POST)
	public ModelAndView searchUserDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		
		String response=adminService.searchUserDetails(email);
		if(response.contains("User Details found")) {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("msg");
			mv.addObject("response", response);
			return mv;
		}
		else {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("msg");
			mv.addObject("response", response);
			return mv;
		}
	}
	
	@RequestMapping(path = "admin/user/delete", method = RequestMethod.POST)
	public ModelAndView deleteUserDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		
		String response=adminService.deleteUserDetails(email);
		if(response.contains("User Details found")) {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("msg");
			mv.addObject("response", response);
			return mv;
		}
		else {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("msg");
			mv.addObject("response", response);
			return mv;
		}
	}
}
