package com.shivam.order.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.order.dto.OrderDTO;
import com.shivam.order.service.OrderService;

@RestController
public class OrderControllor {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/create")
	public String createOrder(@RequestBody OrderDTO dto) {
		String result=orderService.create(dto);
		if(result!=null) {
			return result;
		}else {
			return "OrderId Already Exist";
		}
	}
}
