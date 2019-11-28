package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("deepu");
		al.add("manu");
		al.add("deepz");
		al.add("poo");
		al.add("ashu");
		
		System.out.println("before sort "+al);
		Collections.sort(al);
		System.out.println("after sort "+al);
		
	}

}


