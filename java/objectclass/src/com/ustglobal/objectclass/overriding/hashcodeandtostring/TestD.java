package com.ustglobal.objectclass.overriding.hashcodeandtostring;

public class TestD {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10,"akshatha",300000);
		
		int h = s1.hashCode();
		System.out.println("hashcode is overidden hashcode " +h );
		System.out.println(s1);
		
	}

}
