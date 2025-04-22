package com.Tnsif.Synchronisation;

public class SychronisationMain {

	public static void main(String[] args) {
		
		SynchronisationMethod sm = new SynchronisationMethod();
		
		Thread sm1 = new Thread();
		Thread sm2 = new Thread();
		
		sm.sync(2);
		sm.sync(4);
		
		sm1.start();
		sm2.start();
		

	}

}
