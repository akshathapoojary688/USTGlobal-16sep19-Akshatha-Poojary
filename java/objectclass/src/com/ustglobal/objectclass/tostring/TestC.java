  package com.ustglobal.objectclass.tostring;

public class TestC {
	
	public static void main(String[] args) {
		
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(s);
		System.out.println("hashcode value is "+h);
		
		Marker n = new Marker();
		System.out.println(n);  //internally toString is called whenever we print the reference variable
		
		
	}

}
