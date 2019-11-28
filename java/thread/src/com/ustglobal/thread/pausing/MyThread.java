package com.ustglobal.thread.pausing;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("child thread");
			Thread.yield();
			
			/*
			 * used to pause the execution of thread give oppportunities to other thread
			 * yield() presents inside Thread cls it is static method
			 */
		}
	}

}
