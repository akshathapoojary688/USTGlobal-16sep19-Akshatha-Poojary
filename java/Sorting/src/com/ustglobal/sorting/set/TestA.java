package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();  //hashset doesnt preserve insertion order
		hs.add(12);     //it doesnt hv index so dont hv get method 
		hs.add(45);
		hs.add("deepu");
		hs.add(56.7);
		hs.add(12);   //not allows duplicates
		hs.add(null);    
		
		System.out.println("using for each");  
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("using iterator");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}

}


