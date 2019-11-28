package com.ustglobal.lambdaexpresssion;

public class TestSayHi {
	
	public static void main(String[] args) {
		
		SayHiInterface says = ()-> {
			System.out.println("hi");
			return null;
		};
	}

}
