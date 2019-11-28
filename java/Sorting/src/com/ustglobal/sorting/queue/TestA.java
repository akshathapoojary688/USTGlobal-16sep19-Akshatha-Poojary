package com.ustglobal.sorting.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class TestA {
	
	public static void main(String[] args) {
		
//		Vector v = new Vector();
//		System.out.println(v.capacity());
//		v.add(12);
//		v.add(34);
//		v.add(67);
//		v.add(23);
//		v.add(12);
//		v.add(67);
//		v.add(67);
//		v.add(23);
//		v.add(12);
//		v.add(67);
//		v.add(12);
//		
//		Object[] o = v.toArray();
//		System.out.println(o);
//		List l = Arrays.asList(o);
//		System.out.println(l);
//		
//		
//		System.out.println(v.capacity());
		
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.add(12);
		//pq.add(null);  //we can add only generics and no null
		pq.add(35);
		pq.add(35);
		pq.offer(1);   //same as add
		
		
		System.out.println("before poll "+pq);
		System.out.println("using iterator");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("after poll" +pq);
		
	}
	

}
