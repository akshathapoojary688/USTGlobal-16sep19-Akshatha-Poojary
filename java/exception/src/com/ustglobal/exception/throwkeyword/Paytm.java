package com.ustglobal.exception.throwkeyword;

public class Paytm {
	
	void book() {
		System.out.println("paytm started");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("paytm ended");
	}

}
