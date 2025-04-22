package com.Tnsif.Synchronisation;

public class SynchronisationMethod {
	
	synchronized void sync(int n) {
		for(int i =1; i<=5; i++) {
		System.out.println((n*i));
		}
	}
	

}
