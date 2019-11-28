package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(54);
		al.add(78);
		al.add(87);
		al.add(25);
		
//		List<Integer> l = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList()); filter is of predictable type
		List<Integer> l = al.stream().filter(i -> i%3 == 0).collect(Collectors.toList()); //after data is collected conveerted that to list
		
		for(Integer i : l) {
			System.out.println(i);
			
		}
		
	}

}

