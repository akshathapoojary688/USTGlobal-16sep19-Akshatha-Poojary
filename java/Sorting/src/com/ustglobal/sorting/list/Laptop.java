package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	@Override
	public int compareTo(Laptop lp) {
		Double a = this.price;
		Double b = lp.price;
		return a.compareTo(b);
	}

//	@Override
//	public int compareTo(Laptop s) {
//		String p = this.name;
//		String q = s.name;
//		return p.compareToIgnoreCase(q);
//	}

//	@Override
//	public int compareTo(Laptop s) {
//		
//		Integer i = this.ram;
//		Integer j = s.ram;
//		return i.compareTo(j);
//	}
	
	
	

}
