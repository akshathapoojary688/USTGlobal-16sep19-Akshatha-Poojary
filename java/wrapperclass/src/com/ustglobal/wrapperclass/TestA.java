package com.ustglobal.wrapperclass;

public class TestA {
	
	public static void main(String[] args) {
		int a =10;                 //primitive var
		System.out.println("a is "+a);
		
		Integer i = a;             //autoboxing-converting primitive var to non primitive  or boxing
		System.out.println("i is "+i);
		
		System.out.println("***************************");
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		
		int y = x;   //unboxing- converting non primitive to var into primitive
		System.out.println("y is "+y);
		
		System.out.println("***************************");
		
		int value = Integer.parseInt("123");  //NumberFormatException if " " not given to 123
		System.out.println("value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("result is "+result);
		
		
	}

}

