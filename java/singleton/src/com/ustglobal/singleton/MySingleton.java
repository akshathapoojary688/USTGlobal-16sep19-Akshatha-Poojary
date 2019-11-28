 package com.ustglobal.singleton;

public class MySingleton {
	
	String s;
	private static MySingleton insatnce = null;  

	private MySingleton() {
		
	}
	
	public static MySingleton getDbConnection() {
		
		if(insatnce == null) {
			
			insatnce = new MySingleton();
			return insatnce;
		} else {
			return insatnce;
		}
	}

}

