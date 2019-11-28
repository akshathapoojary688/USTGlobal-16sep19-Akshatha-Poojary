package com.ustglobal.beanobject.bean;

public class TestB {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("aksh");
		s.setRollNo(123);
		
		Database db = new Database();
		db.recieve(s);
	}

}
