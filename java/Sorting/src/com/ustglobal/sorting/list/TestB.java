package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	
	public static void main(String[] args) {
		
		LinkedList<Laptop> ll = new LinkedList<>();
		Laptop lp1 = new Laptop(25000,4,"Hp");
		Laptop lp2 = new Laptop(35000,12,"Dell");
		Laptop lp3 = new Laptop(20000,6,"Ascus");
		Laptop lp4 = new Laptop(45000,8,"Lenovo");
		
		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(40000, 2, "acer"));
		
		//displayLaptopDetails(ll);
		
		Collections.sort(ll);
		displayLaptopDetails(ll);
			
		
	}

	private static void displayLaptopDetails(LinkedList<Laptop> ll) {
		Iterator<Laptop> it = ll.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("brand is "+lp.name);
			System.out.println("price is "+lp.price);
			System.out.println("ram is "+lp.ram);
			
			
		}
		
	}

}
