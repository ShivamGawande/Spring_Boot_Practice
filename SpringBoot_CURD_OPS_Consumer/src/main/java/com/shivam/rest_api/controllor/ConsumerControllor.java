package com.shivam.rest_api.controllor;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shivam.rest_api.dto.Employee_DTO;

@RestController
public class ConsumerControllor {

	@PostMapping("/addemployee")
	public String addEmp(@RequestBody Employee_DTO dto) {
		RestTemplate rest=new RestTemplate();
		HttpEntity<Employee_DTO> entity=new HttpEntity<Employee_DTO>(dto);
		ResponseEntity<String> response = rest.exchange("http://localhost:9990/rest-api/addEmp",HttpMethod.POST, entity, String.class);
		return response.getBody();
	}
}
