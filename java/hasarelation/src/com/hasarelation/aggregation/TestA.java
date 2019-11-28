package com.hasarelation.aggregation;

public class TestA {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name);
		p.eat();
		p.sleep();
		
		System.out.println(p.m.color);
		System.out.println(p.m.size);
		
		p.m.write();
	}

}
