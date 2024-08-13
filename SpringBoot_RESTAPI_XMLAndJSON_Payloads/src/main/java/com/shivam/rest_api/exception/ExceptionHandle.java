package com.shivam.rest_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.UnsupportedMediaType;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionHandle {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleMethodNotValidException(MethodArgumentNotValidException ex,HttpServletRequest req){
		StringBuilder errorMsg=new StringBuilder();
		ex.getBindingResult().getFieldErrors().forEach(error->errorMsg.append(error.getDefaultMessage()).append(";"));
		return new ResponseEntity<String>(errorMsg.toString(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UnsupportedMediaType.class)
	public ResponseEntity<String> handleMediaTypeNotSupportException(UnsupportedMediaType ex,HttpServletRequest req){
		return new ResponseEntity<String>("Please Provide valid data format", HttpStatusCode.valueOf(415));
	}
}
