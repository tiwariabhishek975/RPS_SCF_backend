package com.SCF.SupplyChain.exceptions;

import java.util.HashMap;


import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Handle custom exceptions
    @ExceptionHandler(PhoneNumberAlreadyExistsException.class)
    public ResponseEntity<Object> handleMobileNumberAlreadyExistsException(
    		PhoneNumberAlreadyExistsException ex, WebRequest request) {

        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value()); // 200 status in response body
        response.put("message", ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK); // 200 status in response entity
    }

    
    
    @ExceptionHandler(EmailIdAlreadyExistsException.class)
    public ResponseEntity<Object> handleEmailIdAlreadyExistsException(
            EmailIdAlreadyExistsException ex, WebRequest request) {

        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value()); // 200 status in response body
        response.put("message", ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK); // 200 status in response entity
    }
    
    
    
    @ExceptionHandler(InvoiceNumberAlreadyExist.class)
    public ResponseEntity<Object> handleInvoiceNumberAlreadyExist(
    		InvoiceNumberAlreadyExist ex, WebRequest request) {

        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value()); // 200 status in response body
        response.put("message", ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK); // 200 status in response entity
    }
    
    
    
    
    
    // Handle generic exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGlobalException(Exception ex, WebRequest request) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.put("message", "An unexpected error occurred: " + ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}