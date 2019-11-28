package com.ustglobal.custumizeduncheckedexception;

public class TestAge {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Validator v = new Validator();
		try {
			v.verify(10);
		} 
		catch(InvalidAgeException ie) {
			System.out.println("exception occured");
		}
		
	//	v.verify(13);  //used to print try again later msg, it wiil get if u dont handle within try and catch
		
		
		
		System.out.println("main method ended");
	}

}
