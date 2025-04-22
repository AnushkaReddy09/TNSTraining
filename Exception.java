package com.Tnsif.ExceptionHandling;

public class Exception {

	public static void main(String[] args) {
		int a=9;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("Error: "+ e.getMessage());
		}
		finally {
			System.out.println("change the value from 0");
		}
				

	}

}
