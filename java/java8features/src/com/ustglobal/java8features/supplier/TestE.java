package com.ustglobal.java8features.supplier;

import java.util.function.Supplier;

public class TestE {
	
	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(2,"ajay",78.8);
		
		Student s1 = s.get();
		System.out.println("id is "+s1.id);
		System.out.println("name is "+s1.name);
		System.out.println("percentage is "+s1.percentage);
		System.out.println("------------------------------");
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("value is "+val);
		System.out.println("------------------------------");
		
		Supplier<String> sp = () -> "good evening";
		String v = sp.get();
		System.out.println("value is "+v);
		System.out.println("------------------------------");
		
		
		
	}

}
