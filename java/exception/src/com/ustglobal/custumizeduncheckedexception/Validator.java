package com.ustglobal.custumizeduncheckedexception;

public class Validator {
	
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException("try again next tym");
		}
	}

}
