package com.ustglobal.collection.list;

import java.util.ArrayList;

public class TestTeach {
	
	public static void main(String[] args) {
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();

		Teacher s1 = new Teacher(1,"varun",20000.4);
		Teacher s2 = new Teacher(2,"surya",3567.0);
		Teacher s3 = new Teacher(3,"deepu",34000.1);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		for(int i=0;i<al.size();i++) {
			Teacher s = al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("salary is "+s.salary);
		}
		
		System.out.println("for each-----------------");
		for(Teacher s : al) {
			System.out.println(s);
			
		}

	}
	}


