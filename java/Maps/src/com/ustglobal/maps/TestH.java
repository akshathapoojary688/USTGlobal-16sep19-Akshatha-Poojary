package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(109, "manu");    //does not maintain insertion order
		ht.put(54, "deepu");
		ht.put(908, "varun");
		ht.put(56, "surya");
		ht.put(67, "preethu");   // replace the old value
		//ht.put(null,"john");  // cannot add null to the key
		//ht.put(57, null);     //cannot add null to the value
		
		
		System.out.println(ht);
		
				
	}

}
