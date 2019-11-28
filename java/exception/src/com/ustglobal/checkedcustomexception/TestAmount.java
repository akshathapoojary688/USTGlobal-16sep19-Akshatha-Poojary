package com.ustglobal.checkedcustomexception;

public class TestAmount {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		ValidateAmount va = new ValidateAmount();
		
		try {
			va.checkAmout(60000);
			System.out.println("withdraw ur cash");
		}
		catch(InvalidAmounException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("main ended");
		
	}

}
