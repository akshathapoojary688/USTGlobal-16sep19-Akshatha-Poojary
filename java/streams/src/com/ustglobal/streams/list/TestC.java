package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(78);
		al.add(87);
		al.add(25);
		
		
		List<Integer> l = al.stream().map(i -> i+50).collect(Collectors.toList());  //map is of function interface
		for(Integer i : l) {
			System.out.println(i);
		}
		
	}

}
