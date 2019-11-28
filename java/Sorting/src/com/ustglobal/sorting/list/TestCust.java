package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCust {
	
	public static void main(String[] args) {
		
		SortByCustName sc  = new SortByCustName();
		TreeSet<Customer> ts = new TreeSet<Customer>(sc);
		Customer c1 = new Customer(56,"deepu");
		Customer c2 = new Customer(45,"ashu");
		Customer c3 = new Customer(98,"poo");
		Customer c4 = new Customer(12,"manu");
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("using iterator");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("id is "+c.id);
			System.out.println("name is "+c.name);
			
			System.out.println("------------------------------------");
			
		}
		
	}

}
