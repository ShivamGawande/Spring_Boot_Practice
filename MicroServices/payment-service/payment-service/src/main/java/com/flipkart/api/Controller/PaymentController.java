package com.flipkart.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.api.dto.NetBankingUserDetailsDto;
import com.flipkart.api.dto.PaymentLoginDetailsDto;
import com.flipkart.api.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	
	@PostMapping("/netbanking/register")
	public String netbankingRegister(@RequestBody NetBankingUserDetailsDto orderDetails) {

		return paymentService.netbankingRegister(orderDetails);
	}
	
	
	@PostMapping("/netbanking/login")
	public String netbankingLogin(@RequestBody PaymentLoginDetailsDto paymentlogin) {

		System.out.println("Netbanking Logi for user : "+paymentlogin.getUserId());
		return paymentService.netbankingLogin(paymentlogin);
	}
	

	@GetMapping("/banking/options")
	public List<String> bankingOptionsavilable() {

		
		return  List.of("CC","DC","netbanking","UPI");
	}


}
