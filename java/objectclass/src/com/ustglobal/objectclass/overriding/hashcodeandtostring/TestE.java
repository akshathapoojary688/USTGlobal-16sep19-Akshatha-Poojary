package com.ustglobal.objectclass.overriding.hashcodeandtostring;

public class TestE {
	
	public static void main(String[] args) {
		
		Car c1= new Car(2000000, "audi", "black");
		int hashCode1 = c1.hashCode();
		System.out.println("hashcode is " +hashCode1);
		System.out.println(c1);
		
		System.out.println("**************************");
		
		Car c2 = new Car(1000000, "bmw", "black");
		int hashCode2 = c2.hashCode();
		System.out.println("hashcode is " +hashCode2);
		System.out.println(c2);
		
		System.out.println("**************************");
		
		Car c3 = new Car(3000000, "jaguar", "black");
		int hashCode3 = c3.hashCode();
		System.out.println("hashcode is " +hashCode3);
		System.out.println(c3);
		
		System.out.println("**************************");
		
	}

}
