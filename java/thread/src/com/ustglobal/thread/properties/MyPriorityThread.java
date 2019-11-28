package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority is "+p);
		/*
		 * default priority for main thread is 5
		 * priority ranges from 1 to 10
		 * we can change the priority by using setPriority() method
		 * get the priority using getPriority()
		 * if we change the main thread priority, then child thread priority changes
		 * 1 is minimum priority, 10 max priority
		 * higher priority thread gets executed first
		 */
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority is "+Thread.currentThread().getPriority());
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("MyPriorityThread priority is "+q);
		
		t.setPriority(6);
		System.out.println("MyPriorityThread priority is "+t.getPriority());
		
		System.out.println("main ended");
		
	}

}


