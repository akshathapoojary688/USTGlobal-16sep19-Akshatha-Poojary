package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> hs = new TreeSet<Employee>();
		Employee e1 = new Employee(12,"poo", 450000);
		Employee e2 = new Employee(54,"manu",65432);
		Employee e3 = new Employee(15,"ashu",76459);
		Employee e4 = new Employee(87,"deepu",87123);
		Employee e5 = new Employee(87,"deepu",87123);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("using iterator");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
			System.out.println("------------------------------------");
			
		}
	}
		
		
	}


