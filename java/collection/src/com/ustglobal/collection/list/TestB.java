package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestB {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(3);
		al.add(33.3);
		al.add("surya");
		al.add(true);
		al.add('A');
		
		for(Object o : al) {
			System.out.println(o);
		}
	}

}


