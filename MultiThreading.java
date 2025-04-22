package com.Tnsif.Threads;

public class MultiThreading extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		MultiThreading m1 = new MultiThreading();
		MultiThreading m2 = new MultiThreading();
		
		m1.start();
		m2.start();
		
		
		
		
		
		
		
		
		

	}

}
