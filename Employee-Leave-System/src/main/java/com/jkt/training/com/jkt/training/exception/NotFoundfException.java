package com.jkt.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundfException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundfException(String message) {
		super(message);
	}
	
	

}
