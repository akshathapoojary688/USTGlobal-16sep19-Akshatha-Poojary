package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();    
		hm.put("deepu", 81345674);  //does not preserve insertion order
		hm.put("manu", 56765434);
		hm.put("poo", 56431245);
		hm.put("ashu", 65786534);
		hm.put(null, 56438976);   //only one null is allowed
		hm.put(null, 67873478);  // & if we add more null values then it will take last modifeid value 
		hm.put("pranav", null);   //null  for values is allowed many times
		
		System.out.println("data is "+hm);
		
		hm.put("deepu", 89875645);  //keys duplicates are not allowed
		System.out.println("after giving duplicate  key data "+hm);
		
		hm.put("preethu", 81345674);  //value can be duplicated
		System.out.println("after giving duplicate value "+hm);
		
		System.out.println("after null "+hm);
		Object phoneno = hm.get("manu");     //is used to get the values by passing key
		System.out.println("value is "+phoneno);
		
		Object phoneno1 = hm.get("manuuuu");   //if the key is not present then returns null   
		System.out.println("value is "+phoneno1);
		
		Object value = hm.remove("deepu");     //used to remove key 
		System.out.println("value is "+value);
		System.out.println("after removing "+hm);
		
		
		
		
		
		
		
	}

}
