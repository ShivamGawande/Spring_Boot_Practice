package com.shivam.rest_api.service;

import com.shivam.rest_api.dto.Consumer_Device;

public interface Counsumer_Service {
	Consumer_Device updateDevice( String deviceId, Consumer_Device device);
}
