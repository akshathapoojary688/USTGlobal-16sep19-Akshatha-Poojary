package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(67,"Manu",45.8);
		Student s2 = new Student(87,"poO",83.7);
		Student s3 = new Student(54,"akShu",56.7);
		Student s4 = new Student(83,"aNu",98.1);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
//		displayStudentDetails(al);
		
		// Collections.sort((List<Student>) al); student clas is not implemts comparable only wrapper class 
		//implements comparable inteface which contains compareto method so here we need to override 
		//compareto method to get the sort method
		
		
//		System.out.println("before sorting "+al);
//		displayStudentDetails(al);
		
		Collections.sort(al);
		System.out.println("after sorting "+al);
		displayStudentDetails(al);
		
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
		}
	}

}
