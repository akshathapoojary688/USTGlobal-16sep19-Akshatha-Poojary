package com.ustglobal.singleton;

public class Test {
	
	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "Hello";
		System.out.println("hashcode of ms is "+ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		ms.s = "Hi";
		System.out.println("hashcode of mx is "+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
		
		
		
	}

}

