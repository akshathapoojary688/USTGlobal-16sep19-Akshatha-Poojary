package com.ustglobal.custumizeduncheckedexception;

public class InvalidAgeException extends RuntimeException{
	
	String message = "invalid age below 18yrs not allowed";
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

//	@Override    both getmessage and tostring are same few difference
//	public String toString() {
//		return "InvalidAgeException [message=" + message + "]";
//	}
	
	

}
