package com.ustglobal.thread.defining;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		System.out.println("main metjod started");
		
		MyRunnable mr = new MyRunnable();
		/*
		 * mr.start(); start method is undefined in MyRunnable
		 */
		
		/*
		 * we need to create thread class object to call start method and then we need
		 * to pass the runnable object
		 */
		
		Thread t = new Thread(mr);
		t.start();
		System.out.println("main method ended");
	}

}

