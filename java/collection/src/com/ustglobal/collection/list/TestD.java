package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(22.3);
		al.add("darshan");
		al.add(true);
		al.add(5);
		
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			Object ob = li.hasPrevious();
			System.out.println(ob);
		}
		System.out.println("***************8");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
			
		}
	}

}
