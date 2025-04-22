package com.Tnsif.UserInputs;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		String d = sc.next();
		byte e = sc.nextByte();
		
		System.out.println(a+b+c+d+e);
		sc.close();
	}

}
