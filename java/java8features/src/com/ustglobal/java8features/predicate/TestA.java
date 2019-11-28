package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = (i)-> {
			if(i>=18) {
				return true;
			}else {
				return false;
			}
		};
		 boolean res = p.test(20);  //test is inbuilt method
		 System.out.println("eligible to cast vote--------> "+res);
	}

}
