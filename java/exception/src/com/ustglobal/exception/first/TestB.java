package com.ustglobal.exception.first;

public class TestB {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		int a = 10;
		int b  = 0;
		
		try {
			b = 10/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		System.out.println(b);
		
		System.out.println("main method ended");
	}

}
