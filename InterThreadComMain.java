package com.Tnsif.Synchronisation;

public class InterThreadComMain {

	public static void main(String[] args) {
		
		InterThreadCommunicationMethod a = new InterThreadCommunicationMethod();
		
		new Thread(() ->{
			try {
				for(int i=1;i<=5;i++) a.produce(i);
			}
			catch(Exception e) {}
		}).start();
			
			new Thread(() -> {
				try {
					for(int i=1;i<=5;i++) a.consume();
				}
				catch(Exception e) {}
			}).start();
			
		}

	}


