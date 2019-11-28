package com.ustglobal.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	
	public static void main(String[] args) {
		
		Stack li = new Stack();
		li.add(3);
		li.add(3);
		li.add(33.3);
		li.add("pruthvi");
		li.add(null);
		li.add(null);
		li.add(true);
		
		System.out.println("using for--------------------");
		for(int i=0;i<5;i++) {
			Object obj = li.get(i);
			System.out.println(obj);
		}
		
		System.out.println("using for each-----------------");
		for(Object object : li) {
			System.out.println(object);
		}
		
		System.out.println("using iterator-------------------");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("using list iterator------------------");
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o1 = lt.next();
			System.out.println(o1);
	}

	}
}
