package com.Tnsif.Threads;

public class NewThread extends Thread{
	public void cat() {
		System.out.println("cat is playing...");
	}

	public static void main(String[] args) {
		NewThread t = new NewThread();
		t.start();

	}

}
