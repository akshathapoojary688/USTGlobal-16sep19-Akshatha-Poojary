package com.ustglobal.studentapp.qspiders;

import static com.ustglobal.studentapp.jspiders.Remote.*;  //used to import only static properties
import com.ustglobal.studentapp.jspiders.Remote;

public class TestB {
	public static void main(String[] args) {
		//Remote.on();   classname is not required in the case of import static 
		
		on();
		System.out.println(num);
		Remote r = new Remote();
		System.out.println(r.sum);
		
		
	}

}
