package com.jkt.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<Object> AllException(Exception e,WebRequest w){
		ErrorDetails error=new ErrorDetails(e.getMessage(), w.getDescription(true));
		return new ResponseEntity<Object>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NotFoundfException.class)
	public ResponseEntity<Object> resourcenotfound(NotFoundfException e,WebRequest w){
		ErrorDetails error=new ErrorDetails(e.getMessage(), w.getDescription(true));
		return new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
	}
	
}
