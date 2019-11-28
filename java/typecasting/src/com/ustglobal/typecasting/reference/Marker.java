package com.ustglobal.typecasting.reference;

public class Marker extends Pen {
	double size;
	void color() {
		System.out.println();
	}
	
	
	//when we hv override method in child cls then will get child implementation after upcasting also
	void write() {    
		System.out.println("marker write()");
	}

}
