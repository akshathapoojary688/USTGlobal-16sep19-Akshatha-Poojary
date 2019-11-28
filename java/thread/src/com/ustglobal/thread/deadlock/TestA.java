package com.ustglobal.thread.deadlock;

public class TestA extends Thread{
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		Runnable r1 = () -> {
			synchronized (obj1) {
				System.out.println("t1 started"); 
				System.out.println("t1 has locked obj1");
				
				try {
					obj1.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				synchronized (obj2) {
					System.out.println("t1 has locked");
				}
			}
			
		};
		Runnable r2 = () -> {
			synchronized (obj2) {
				System.out.println("t2 started"); 
				System.out.println("t2 has locked obj1");
				
				synchronized (obj1) {
					System.out.println("t2 has locked");
					//obj1.notify();   //whichever the thread is waiting for this object will be notified
					obj1.notifyAll(); //it will notify all the thread whichever is waiting for the object
					//it also releases the object lock
				}
			}
			System.out.println("t2 finished");
			
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
