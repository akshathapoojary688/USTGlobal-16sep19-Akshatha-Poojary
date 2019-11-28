package com.ustglobal.beanobject.bean2;

import com.ustglobal.beanobject.bean.Database;

public class TestA {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(3);
		e.setName("akshatha");
		e.setSalary(30000);
		e.setDept("developer");
		e.setDesignation("software engineer");
		
		Database2 db = new Database2();
		db.recieve(e);
	
	}

}
