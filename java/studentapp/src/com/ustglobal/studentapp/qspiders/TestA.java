package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Angular;  //1st way to import angular from one package to another
//import com.ustglobal.studentapp.jspiders.React;

import com.ustglobal.studentapp.jspiders.*; //to import all the class under this package use *

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQtp();
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
		/*com.ustglobal.studentapp.jspiders.Angular a = new com.ustglobal.studentapp.jspiders.Angular();
		a.teachAngular();*/  //  2nd way using fullyqualified class name
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r =new React();
		r.teachReact();
	}
	
	

}
