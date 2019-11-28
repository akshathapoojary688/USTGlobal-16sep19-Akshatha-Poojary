package com.ustglobal.immutableclass;

public class TestString {
	
	public static void main(String[] args) {
		
		MyString ms = new MyString(12, "arpi");
		System.out.println(ms.getRollno());
		System.out.println(ms.getName());
		System.out.println(ms);
		
		ms.changeContent(3, "deepu");   //values cannot change
		System.out.println(ms.getRollno());
		System.out.println(ms.getName());
		
		
		MyString ms1 = ms.changeContent(3, "deepu");  //if u assign to some var then values will be changed
		System.out.println(ms1.getRollno());
		System.out.println(ms1.getName());
		
	}
	
	

}
