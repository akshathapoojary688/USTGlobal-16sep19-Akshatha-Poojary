package com.ustglobal.java8features.consumer;

import java.util.ArrayList;

public class TestG {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student(3,"deepu",98.7));
			al.add(new Student(4,"anju",30.4));
			al.add(new Student(7,"manu",96.7));
			al.add(new Student(5,"prrethu",35.7));
			al.add(new Student(9,"poo",99.7));
			
			Helper h = new Helper();
			//h.displayAllStudent(al);
			
			//h.displayFailedStudents(al);
			
			//h.displayPassStudents(al);
			
			h.displayTopperStudents(al);
			
			
			
			
			
		
	}

}
