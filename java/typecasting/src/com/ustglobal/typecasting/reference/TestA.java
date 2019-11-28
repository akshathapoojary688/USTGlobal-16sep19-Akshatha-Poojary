package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		
		//Pen p = new Pen();
		//Marker m = new Marker();
		
		Pen p = new Marker();  //upcasting 
		System.out.println(p.cost);
		p.write();          
		
		//p.color();  giving error bcs p it acts only like pen class
		System.out.println("*****************************");
		
		Marker m = (Marker)p;     //downcasting
		System.out.println(m.size);
		m.color();
		m.write();
		
		
	}

}
