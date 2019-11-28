package com.ustglobal.lambdaexpresssion;

public class TestAdd implements AddInterface{
	public static void main(String[] args) {

		TestAdd t1 = new TestAdd();
		int sum = t1.add(2, 3);
		System.out.println("sum is  "+sum);

	}

	@Override
	public int add(int a, int b) {

		return a+b;
	}
}

