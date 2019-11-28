package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	
	public static void main(String[] args) {
		
		//sorting by height
		
//		Comparator<Employee> comp = (e1,e2) -> {
//			if(e1.height>e2.height) {
//				return 1;
//			}else if(e1.height<e2.height) {
//				return -1;
//			} else {
//				return 0;
//			}
//		};
//		
//		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		
	//	System.out.println("============================");
		
//		Sorting by name
//		
//		Comparator<Employee> comp = (e1,e2) -> {
//			return e1.name.compareTo(e2.name);
//		};
//		
//		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		
		System.out.println(("============================"));
		
		Comparator<Employee> comp = (e1,e2) -> {
			if(e1.id>e2.id) {
				return 1;
			} else if(e1.id<e2.id) {
				return -1;
			} else {
				return 0;
			}
		};
		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(17,"poo",5.6);
		Employee e2 = new Employee(34,"manu",5.4);
		Employee e3 = new Employee(67,"ashu",5.3);
		Employee e4 = new Employee(45,"deepu",5.9);
		
		ts.add(e1);
		ts.add(e2);	
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("using iterator========================");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("employee id is " +e.id);
			System.out.println("employee name is "+e.name);
			System.out.println("employee height is "+e.height);
			System.out.println("=====================================");
			
		}
		
	}

}
