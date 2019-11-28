package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {

		System.out.println("main started");

		try {                  //checked exception 
			Thread.sleep(3000);    //it is not always throw the exception but still need to handle this
			System.out.println("inside try");  
		} catch (InterruptedException e) {
			System.out.println("exception caught");
			e.printStackTrace();
		}

		System.out.println("main ended");

	}

}


