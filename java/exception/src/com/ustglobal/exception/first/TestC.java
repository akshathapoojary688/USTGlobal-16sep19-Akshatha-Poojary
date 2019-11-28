package com.ustglobal.exception.first;

public class TestC {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		int a = 10;
		int b = 0;
		try {
			b= 10/0;
            System.out.println(b); //these lines will not get excecuted bcs once the catch block executed
            System.out.println("hello");  //it will again not come to try
            System.out.println("happy deepavali");
		}
		catch(ArithmeticException ae) {
			System.out.println("divided by zero");
		}
		System.out.println("main method ended");
	}

}
