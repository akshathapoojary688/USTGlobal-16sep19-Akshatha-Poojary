package com.ustglobal.exception.throwkeyword;

public class TestA {

	public static void main(String[] args) {

		System.out.println("main method started");

		Paytm p = new Paytm();

		try {
			p.book();
		}
		catch(ArithmeticException ae) {
			System.out.println("exception caught in main");
		}
		finally {
			System.out.println("executing finally");
		}

		System.out.println("main method ended");
	}

}
