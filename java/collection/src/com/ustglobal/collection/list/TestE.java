package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestE {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("varun");
		al.add("surya");
		al.add("abhay");
		
		Object o = al.get(0);
		String name = (String)o;  //downcast to access child class property
		
		name = name.toUpperCase();
		System.out.println(name);
		
		
	}

}
