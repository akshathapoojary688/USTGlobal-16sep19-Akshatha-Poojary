package com.ustglobal.java8features.functioninterface;

import java.util.function.Function;

public class TestC {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i -> i*i;
		
		int res = f.apply(5);  //apply is a builtin method
		System.out.println("result is "+res);
		
	}

}
