package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer> ();
		al.add(70);
		al.add(25);
		al.add(30);
		al.add(56);
		al.add(89);
		al.add(42);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
		//	System.out.println("sorted-------------------->");
			System.out.println(i);

		}
	}

}
