package com.ustglobal.lambdaexpresssion;

public class TestGreeting {
	
	public static void main(String[] args) {
		
		GreetingInterface greetService1 = (message) -> 
//			System.out.println("hello");
//			System.out.println(message);
//			return message;
			System.out.println("hello" +message);
			greetService1.greet("hi");
			
		
	
	}

}


