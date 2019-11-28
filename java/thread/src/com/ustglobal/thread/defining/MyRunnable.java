package com.ustglobal.thread.defining;

public class MyRunnable implements Runnable{

	/*
	 * Runnable is an functional interface which contains only one abstract method
	 * ie run() we need to override
	 */
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
	
}
