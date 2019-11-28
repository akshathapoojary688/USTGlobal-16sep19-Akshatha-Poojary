package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
	
	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen p) {
		Double a = this.price;
		Double b = p.price;
		return a.compareTo(b);
	}
	

}
