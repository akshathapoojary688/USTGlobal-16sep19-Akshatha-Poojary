package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo{

	public static void main(String[] args) {

		Demo d = new Demo();

		//System.out.println(d.a);  private var cannot access outside
		//d.add()  private

		//System.out.println(d.b);    //default var cannnot be accesed within different package
		//d.sub();                    //default

		Sample s = new Sample();    //by creating sub cls object we can access protected members by inheriting 
		System.out.println(s.c);    //protected var can be accessed within same package
		s.mul();                    //protected

		System.out.println(d.name);  //public can be acceseed
		d.div();
	}




}
