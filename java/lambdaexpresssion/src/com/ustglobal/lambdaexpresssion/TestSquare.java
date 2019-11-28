package com.ustglobal.lambdaexpresssion;

public class TestSquare {
	
	public static void main(String[] args) {
		
		SquareInterface sq = x->x*x;
		int value = sq.square(5);
		System.out.println("square is "+value);
	}
	
	

}
