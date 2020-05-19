package com.jkt.training.exception;

public class ErrorDetails {

	private String message,datils;

	public ErrorDetails(String message, String datils) {
		super();
		this.message = message;
		this.datils = datils;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDatils() {
		return datils;
	}

	public void setDatils(String datils) {
		this.datils = datils;
	}	
}
