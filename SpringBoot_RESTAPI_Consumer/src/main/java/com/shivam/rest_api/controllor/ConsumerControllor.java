package com.shivam.rest_api.controllor;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shivam.rest_api.dto.ConsumerDTO;
import com.shivam.rest_api.dto.Consumer_Country;
import com.shivam.rest_api.dto.Consumer_CountryData;
import com.shivam.rest_api.dto.Consumer_Device;
import com.shivam.rest_api.dto.Consumer_Flip_User;
import com.shivam.rest_api.service.Counsumer_Service;

@RestController
public class ConsumerControllor {
	
	@Autowired
	Counsumer_Service counsumer_Service;

	@RequestMapping("/add")
	public String addUser(@RequestBody ConsumerDTO user ) {
		//RestTem obj
		RestTemplate rest=new RestTemplate();
		//method type
		//payload sample yes
//		ConsumerDTO user=new ConsumerDTO();
//		user.setfName("Shivam");
//		user.setfName("Gawande");
//		user.setEmail("shivamgawande0503@gmail.com");
//		user.setCity("Akola");
//		user.setCountry("India");
//		user.setGender("Male");
//		user.setAge(24);
		
		HttpEntity<ConsumerDTO> entity = new HttpEntity<ConsumerDTO>(user);
		ResponseEntity<String> response= rest.exchange("http://localhost:9999/rest-api/addUser", HttpMethod.POST, entity, String.class);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		return response.getBody();
	}
	
	@RequestMapping("/getUserInfo")
	public List<ConsumerDTO> getUserInformation(@RequestParam String cityValue,@RequestParam(required = false) String genderValue){
		
		String url="http://localhost:9999/rest-api/getUser?City={cityValue}&gender={genderValue}";
		
		Map<String,String> values = new HashMap<>();
		values.put("cityValue", cityValue);
		values.put("genderValue", genderValue);
		
		RestTemplate rest = new RestTemplate();
		List<ConsumerDTO> users = rest.getForEntity(url, List.class, values).getBody();
		System.out.println(rest.getForEntity(url, List.class, values).getBody());
		System.out.println(rest.getForEntity(url, List.class, values).getStatusCode());
		return users;
		
	}
	
	@RequestMapping("/addFlipUser")
	public String addUser(@RequestBody Consumer_Flip_User user){
		String url="http://localhost:9999/rest-api/user/create";
		RestTemplate rest = new RestTemplate();
		HttpEntity<Consumer_Flip_User> entity= new HttpEntity<Consumer_Flip_User>(user);
		ResponseEntity<String> response=rest.postForEntity(url, entity, String.class);
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		return response.getBody();
	}
	
	@RequestMapping("/getAllMobileData")
	public List<Consumer_Device> getAllMobileData(){
		
		String url="https://api.restful-api.dev/objects";
		
		RestTemplate rest = new RestTemplate();
		List<Consumer_Device> devices = rest.getForEntity(url, List.class).getBody();
		System.out.println(rest.getForEntity(url, List.class).getBody());
		System.out.println(rest.getForEntity(url, List.class).getStatusCode());
		
		return devices;
	}
	
	@RequestMapping("/device/{deviceId}")
	public ResponseEntity<Consumer_Device> updateDevice(@PathVariable String deviceId,@RequestBody Consumer_Device device){
		try {
			ResponseEntity<Consumer_Device> update= new ResponseEntity<Consumer_Device>(device, HttpStatus.OK);
			return update;
		}catch (IllegalArgumentException e) {
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	
	@RequestMapping("/getCountry")
	public List<Consumer_Country> getCountryData() {
        String url = "https://countriesnow.space/api/v0.1/countries/positions";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Consumer_CountryData> response = restTemplate.getForEntity(url, Consumer_CountryData.class);
        Consumer_CountryData consumer_CountryData = response.getBody();

        if (consumer_CountryData != null && consumer_CountryData.getData() != null) {
            return consumer_CountryData.getData();
        } else {
            // Handle error or return empty list
            return Collections.emptyList();
        }
	}
}

