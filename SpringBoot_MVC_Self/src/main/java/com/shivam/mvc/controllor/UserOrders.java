package com.shivam.mvc.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserOrders {
	
	@RequestMapping("/userOrder")
	public String loadUserOrderForm() {
		return "order";
	}
	
	@RequestMapping(path = "user/order",method = RequestMethod.POST)
	public ModelAndView getOrderDetails(HttpServletRequest req) {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String food=req.getParameter("food");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(food);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ordersuccess");
		mv.addObject("result", "Your Order is successfully placed for: "+food);
		return mv;
	}
}
