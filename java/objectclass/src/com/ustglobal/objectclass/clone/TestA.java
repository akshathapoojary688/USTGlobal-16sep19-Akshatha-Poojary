package com.ustglobal.objectclass.clone;

public class TestA {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person(1,"akshatha");
		System.out.println("p1 id is "+p1.id);
		System.out.println("p1 name is "+p1.name);
		
		Object o = p1.clone();
		Person p2 = (Person)o;
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);
		
		p2.id = 3;
		p2.name = "surya";
		System.out.println("--------------after cloning---------------");
		System.out.println("p1 id is "+p1.id);
		System.out.println("p1 name is "+p1.name);
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);
		
	}
}

