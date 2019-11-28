package com.ustglobal.checkedcustomexception;

public class InvalidAmounException  extends Exception{
	
	private String message = "daily limit is 40000";
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
