package com.hasarelation.aggregation;

public class Person {
	
	String name = "akshatha";
	
	Marker m = new Marker();  //one class is having another class object is has a relationship
	
	void sleep() {
		System.out.println("person sleep()");
	}
	void eat() {
		System.out.println(" person eat()");
	}
	

}
