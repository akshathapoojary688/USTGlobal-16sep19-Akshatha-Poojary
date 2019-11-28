package com.ustglobal.thread.pausing;

public class Test {
	public static void main(String[] args) {
		
		Counter c = new Counter();
		Runnable r1 = () -> {
			c.increment();
			c.showValue();
		};
		
		Runnable r2 = () -> {
			c.decrement();
			c.showValue();
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
	}

}

