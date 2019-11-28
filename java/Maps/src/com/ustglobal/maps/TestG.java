package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {

		Employee e1 = new Employee(23,"manu",239879);
		Employee e2 = new Employee(34,"anju",564373);
		Employee e3 = new Employee(24,"pallu",87643);
		Employee e4 = new Employee(78,"poo",98979);
		Employee e5 = new Employee(56,"aksh",87654);
		Employee e6 = new Employee(89,"raksh",87965);
		Employee e7 = new Employee(25,"anju",324563);
		Employee e8 = new Employee(65,"preethu",876577);
		Employee e9 = new Employee(89,"varu",345678);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);

		HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("thisrd",al2);

		ArrayList<Employee> second =	hm.get("second");

		Iterator<Employee> it = second.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("salary is "+e.salary);

		}

	}
}