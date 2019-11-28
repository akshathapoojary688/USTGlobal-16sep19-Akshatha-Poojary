package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;	

public class TestF {



	public static void main(String[] args) {

		Student s1 = new Student(23,"deepu",91);
		Student s2 = new Student(78,"poo",98.6);
		Student s3 = new Student(45,"manu",78.8);
		Student s4 = new Student(46,"ashu",98);
		Student s5 = new Student(12,"anju",97);
		Student s6 = new Student(89,"varun",99.8);
		Student s7 = new Student(65,"surya",93);
		Student s8 = new Student(34,"aksh",92);
		Student s9 = new Student(99,"raksh",96);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<>();
		al.add(s4);
		al.add(s5);
		al.add(s6);

		ArrayList<Student> al2 = new ArrayList<>();
		al.add(s7);
		al.add(s8);
		al.add(s9);

		HashMap<String,ArrayList<Student>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);

		ArrayList<Student> first = hm.get("second");

		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("=============================");

		}










	}

}
