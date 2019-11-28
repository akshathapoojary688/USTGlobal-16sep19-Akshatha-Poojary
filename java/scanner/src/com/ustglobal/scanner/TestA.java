package com.ustglobal.scanner;

import java.util.Scanner;

public class TestA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("age is "+age);
		
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("name is "+name);
		
		System.out.println("enter place");
		String place = sc.next();
		System.out.println("place is "+place);
		
		System.out.println("are u single?");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		
		
	}

}
