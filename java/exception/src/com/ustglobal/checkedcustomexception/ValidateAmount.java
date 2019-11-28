package com.ustglobal.checkedcustomexception;

public class ValidateAmount {
	
	void checkAmout(int amount) throws InvalidAmounException {
		if(amount>40000) {
			throw new InvalidAmounException();
		}
	}

}
