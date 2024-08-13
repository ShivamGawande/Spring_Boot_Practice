package com.shivam.rest_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllorAdvice {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ResponseEntity<String> nullPointerHandler(NullPointerException ex, HttpServletRequest request ) {
        return new ResponseEntity<String>("Fields Can't be null please try again", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<String> methodNotValid(MethodArgumentNotValidException ex, HttpServletRequest request) {
        String errorMessage = "Please Check one of the field it can't be empty or null";
        return new ResponseEntity<String>(errorMessage, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Value Can't be Zero");
    }
}
