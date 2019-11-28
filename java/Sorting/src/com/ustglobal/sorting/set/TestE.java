package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(11);    //elts are so
		ts.add(13);
		ts.add(56);
		ts.add(78);
		ts.add(45);
		
		System.out.println("using for each");
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("using iterator");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
	}

}
