package com.Tnsif.Synchronisation;

public class InterThreadCommunicationMethod {
	
	int data;
	boolean hasData = false;
	
	synchronized void produce(int val) throws InterruptedException {
		while(hasData) wait();
		data = val;
		System.out.println("Produced value is:" + val);
		hasData = true;
		notify();
	}
	synchronized void consume() throws InterruptedException {
		while(!hasData) wait();
		
		System.out.println("Consumed value:" + data);
		hasData = false;
		notify();
	
	}

}
