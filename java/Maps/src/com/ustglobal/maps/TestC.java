package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {

		LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
		lh.put("banglore", 560068);
		lh.put("hariyana", 134203);
		lh.put("patna", 880000);

		System.out.println(lh);

		//		Set<String> s = lh.keySet();
		//		Iterator<String> it = s.iterator();
		//		while(it.hasNext()) {
		//			String s1 = it.next();
		//			System.out.println(s1);

		Set<String> s = lh.keySet();
		for(String key : s) {
			System.out.println("key is  "+key);

		}
		
		System.out.println("==============================");
		
		Collection<Integer> c = lh.values();
		for(Integer value : c) {
			System.out.println("value is "+value);
		}

	}

}
