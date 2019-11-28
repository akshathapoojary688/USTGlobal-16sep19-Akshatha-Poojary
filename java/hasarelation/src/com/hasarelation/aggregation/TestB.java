package com.hasarelation.aggregation;

public class TestB {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.color);
		c.drive();
		
		System.out.println(c.m.name);
		c.m.musicOn();
	}

}

