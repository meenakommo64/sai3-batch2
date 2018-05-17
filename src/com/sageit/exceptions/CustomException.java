package com.sageit.exceptions;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomException() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		
		return "My Custom exception";
		
	}
}
