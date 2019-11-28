package com.ustglobal.accessmodifier.pkg2;

public class Run {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		//System.out.println(d.a);  private var cannot access outside
		//d.add()  private
		
		System.out.println(d.b);    //default var can be accesed within same package
		d.sub();                    //default
		
		System.out.println(d.c);    //protected var can be accessed within same package
		d.mul();                    //protected
		
		System.out.println(d.name);  //public can be acceseed
		d.div();
		
	}

}
