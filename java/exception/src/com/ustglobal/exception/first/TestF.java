package com.ustglobal.exception.first;

public class TestF {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String s = "hello";
		int[] a = {10,20,30};
		int b= 10;
		
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}
		catch(NullPointerException npe) {
			System.out.println("dont use null");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("index is not present");
		}
		catch(ArithmeticException ae) {
			System.out.println("divided by zero");
		}
		catch(Exception e) {          //genaral catch block
			e.printStackTrace();
		}
		
		System.out.println("main ended");
		
	}

}                                                                                                                                    

