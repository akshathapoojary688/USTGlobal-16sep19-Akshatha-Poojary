package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestEmp {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		Employee s1 = new Employee(1,"varun",20000.4);
		Employee s2 = new Employee(2,"surya",3567.0);
		Employee s3 = new Employee(3,"deepu",34000.1);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		for(int i=0;i<al.size();i++) {
			Employee s = al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("salary is "+s.salary);
		}
		
		System.out.println("for each-----------------");
		for(Employee s : al) {
			System.out.println(s);
			
		}

	}
}
