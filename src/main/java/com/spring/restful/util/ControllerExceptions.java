package com.spring.restful.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.restful.exception.StudentException;
import com.spring.restful.model.StudentError;

@ControllerAdvice
public class ControllerExceptions {

	
	@ExceptionHandler
	public ResponseEntity<StudentError> getException(Exception se) {
		StudentError studentError = new StudentError();
		studentError.setStatusCode(HttpStatus.BAD_REQUEST.value());
		studentError.setMessage(se.getMessage());
		studentError.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentError>(studentError, HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler
	public ResponseEntity<StudentError> getException(StudentException se) {
		StudentError studentError = new StudentError();
		studentError.setStatusCode(HttpStatus.NOT_FOUND.value());
		studentError.setMessage(se.getMessage());
		studentError.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentError>(studentError, HttpStatus.NOT_FOUND);
	}
	
	
}
