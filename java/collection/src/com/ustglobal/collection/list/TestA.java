package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(3);
		al.add(33.3);
		al.add("prathvi");
		al.add(true);
		al.add(null);
		al.add('A');
		
		for(int i=0; i<6;i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
		
	}

}
