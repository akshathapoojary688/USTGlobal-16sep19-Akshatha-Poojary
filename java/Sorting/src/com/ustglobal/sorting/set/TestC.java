package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(11);    //elts are so
		ls.add("deepu");
		ls.add(56);
		ls.add(null);
		ls.add(45);
		
		System.out.println("using for each");
		for(Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("using iterator");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
	}

}
