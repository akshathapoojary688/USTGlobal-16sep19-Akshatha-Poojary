package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {

		ArrayList<Pen> al = new ArrayList<Pen>();

		Pen p1 = new Pen(30,"cello");
		Pen p2 = new Pen(20,"good luck");
		Pen p3 = new Pen(40,"bright");
		Pen p4 = new Pen(60,"apsara");

		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);

		Collections.sort(al);
		printPenDetails(al);
	}
	static void printPenDetails(ArrayList<Pen> al) {
		Iterator<Pen> it = al.iterator();
		while(it.hasNext()) {
			Pen p = it.next();
			System.out.println("pen price is "+p.price);
			System.out.println("pen name is "+p.brand);

		}

	}


}


