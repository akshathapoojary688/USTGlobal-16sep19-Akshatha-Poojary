package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();  //in all the warapper cls like Double  tostring method is overrideen
		al.add(34.5);
		al.add(23.5);
		al.add(87.6);
		al.add(12.3);
		al.add(34.5);  //list allow duplicates
		al.add(null); //list allows null
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, 54.6);
		System.out.println("afetr adding in 2nd index " +al);
		
		al.remove(0);
		System.out.println("after removed at 0th index " +al);
		
		al.remove(null);
		System.out.println("after removing null " +al);
		
		Double val = al.get(4);
		System.out.println("object at 4rth index " +val);
		 
		al.set(2, 77.6);
	    System.out.println("after replacing 2nd index "+al);
	    
	    boolean contains = al.contains(54.6);
	    System.out.println("contains "+contains);
		 
		//al.clear();
		System.out.println("after clear method "+al);
		 
		
		System.out.println("*******************");
		
		
		List<Double> al1 = new ArrayList<>();  //upcasting
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		al.addAll(al1);
		System.out.println("after add all "+al);
		
		boolean contain = al.containsAll(al1);
	    System.out.println("contains all of al1 "+contain);
	     
	    boolean res = al.removeAll(al1);
	    System.out.println("Removed all of al1 "+res);
	     
		
		
		
		
		
		 
	 
	}

}

