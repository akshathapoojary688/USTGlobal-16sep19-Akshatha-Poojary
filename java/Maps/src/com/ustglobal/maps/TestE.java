package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	
	public static void main(String[] args) {
		
		TreeMap<String,Integer> lh = new TreeMap<>();
		lh.put("patna", 560068);   
		lh.put("hariyana", 134203);
		lh.put("banglore", 880000);   //sorting will be based on key
		//lh.put(null, 567645543);   null cannnot be added  NullPointerException
		
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("-------------------------------");
			
		}
		
		
		
	}

}
