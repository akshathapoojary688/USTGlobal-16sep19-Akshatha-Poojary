package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(3);
		al.add(33.3);
		al.add("deepu");
		al.add(true);
		al.add(null);
		al.add('A');
		
//		for(int i=0; i<al.size(); i++) {
//			Object o = al.get(i);
//			System.out.println(o);
//		}
		
//		Iterator it = al.iterator();
//		Object o1 = it.next();
//		System.out.println("obj1 "+o1);
//		
//		Object o2 = it.next();
//		System.out.println("obj2 "+o2);
//		
//		Object o3 = it.next();
//		System.out.println("obj3 "+o3);
//		
//		Object o4 = it.next();
//		System.out.println("obj4 "+o4);
//		
//		Object o5 = it.next();
//		System.out.println("obj5 "+o5);
//		
//		Object o6 = it.next();
//		System.out.println("obj6 "+o6);
//		
//		boolean b = it.hasNext();
//		System.out.println(b);
//		
//		Object o7 = it.next();
//		System.out.println("obj7 "+o7);
		
		ArrayList al1 = new ArrayList();
		al1.add(4);
		al.add("anju");
		al1.add("deepu");
		al1.add(true);
		
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
		
	}
}












