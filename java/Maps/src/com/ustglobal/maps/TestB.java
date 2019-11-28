package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("deepu", 81345674);  
		hm.put("manu", 56765434);
		hm.put("poo", 56431245);
		hm.put("ashu", 65786534);
		
		HashMap hm1 = new HashMap();
		hm1.put("surya", 456763789);
		hm1.put("varun", 45890989);
		hm1.put("varsha",45675612);
		
		boolean hasKey = hm.containsKey("manu");  //checks key is present or not
		System.out.println("has key "+hasKey);
		
		boolean hasValue = hm.containsValue(56431245);  //checks value is present or not
		System.out.println("has value "+hasValue);
		
		hm.putAll(hm1);  //is used to copy one hashmap to another hashmap it does not return anything just display
		System.out.println("after putAll method "+hm);
		
		System.out.println("size of map is "+hm.size());  //use dto get the size
		
		boolean isEmpty = hm.isEmpty();     //checks map is empty or not
		System.out.println("map is empty "+isEmpty);
		
		hm.clear();       //used to clear all the key value of map
		System.out.println("after clear "+hm);
		
	}

}
