package com.ustglobal.thread.defining;

public class TestThread {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		System.out.println("main method started");
		
		/*
		 * don't call run() method directly, it behaves like normal method not a thread
		 */
		//t1.run();
		
		
		t1.start();
		
		/*
		 * we cannot call start once again then we will get illegal thread start
		 * exception
		 */
		//t1.start();

		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main method ended");
		
	}
}                                                                                                      
