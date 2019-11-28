package com.ustglobal.arrays;

public class TestA {
	
	public static void main(String[] args) {
		
		/*int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;*/ 
		
		//or
		
		int[] nums = {10,20,30,40,50};
		
		/*for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}*/ 
		
		//or forEach loop
		
		for(int i: nums) {
			System.out.println(i);
		}
		
		System.out.println("**********************");
		char[] ch = {'a','b','c','d'};
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("****************************");
		for(int c: ch) {
			System.out.println(c);
		}

		System.out.println("*************************");
		
		boolean[] b = {true,false,false,true};
		for(int i = 0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("****************************");
		for(boolean i: b) {
			System.out.println(i);
		}
		
		System.out.println("****************************");
		
		byte[] n = {10,20,30,40,50};
		
		for(int i = 0; i<n.length;i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("****************************");
		for(int i: n) {
			System.out.println(i);
		}
		
		System.out.println("****************************");
		
		double [] n1 = {10.5,20.8,30.5,40.9,50.4};
		
		for(int i = 0; i<n1.length;i++) {
			System.out.println(n1[i]);
		}
		
		System.out.println("****************************");
		for(double i: n1) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------------");
		
		String[] names = {"aks","deepu","anju"};
		for(int i = 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("******************");
		
		for(String i :names) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}

