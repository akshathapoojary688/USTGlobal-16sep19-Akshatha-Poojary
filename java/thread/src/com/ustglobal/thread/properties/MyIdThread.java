package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println( "main thread id is "+Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());
		
		/* 
		 * mi.setId(); there is no setId method , we can just get the thread id 
		 * 
		 * */
		System.out.println("priority "+Thread.currentThread().getPriority());
		
		/*Thread.currentThread().setPriority(16); IllegalArgumentException */
		System.out.println("main ended");
		
		
	}

}
