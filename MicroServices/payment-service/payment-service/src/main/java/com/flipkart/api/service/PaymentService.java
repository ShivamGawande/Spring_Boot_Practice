package com.flipkart.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.api.dto.NetBankingUserDetailsDto;
import com.flipkart.api.dto.PaymentLoginDetailsDto;
import com.flipkart.api.entity.PaymentDetails;
import com.flipkart.api.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository payemntRepository;

	public String netbankingLogin(PaymentLoginDetailsDto paymentDetails) {

		PaymentDetails data =  payemntRepository.findByUserIdAndPassword(paymentDetails.getUserId(), paymentDetails.getPassword());
		
		if(data != null) {
		return "Net Banking Login Success";
		}else {
			return "Net Banking Login Failed";
		}
	}

	public String netbankingRegister(NetBankingUserDetailsDto neBankingUserDetails) {
		PaymentDetails paymentDetails = new PaymentDetails();
		paymentDetails.setAvilabaleBalnce(neBankingUserDetails.getAvilabaleBalnce());
		paymentDetails.setName(neBankingUserDetails.getName());
		paymentDetails.setPassword(neBankingUserDetails.getPassword());
		paymentDetails.setUserId(neBankingUserDetails.getUserId());
		payemntRepository.save(paymentDetails);

		return "Netbanking User reg. Success, try Login Now";
	}

}
