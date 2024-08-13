package com.shivam.rest_api.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shivam.rest_api.dto.Consumer_Device;

@Service
public class Cosumer_ServiceImpl implements Counsumer_Service{

	@Override
	public Consumer_Device updateDevice(String deviceId, Consumer_Device device) {
		String url="https://api.restful-api.dev/objects/"+deviceId;
		HttpEntity<Consumer_Device> entity = new HttpEntity<Consumer_Device>(device);
		RestTemplate rest = new RestTemplate();
		Consumer_Device response= rest.exchange(url, HttpMethod.PATCH,entity, Consumer_Device.class).getBody();
		return response;
	}

	
}
