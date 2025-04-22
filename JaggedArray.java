package com.Tnsif.Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jagged[][]= new int[3][];
		
		jagged[0] = new int[2];
		jagged[1] = new int[3];
		jagged[2] = new int[4];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<jagged.length;i++){
			for(int j=0;j<jagged[i].length;j++) {
				jagged[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Jagged Array: ");
		for(int i=0;i<jagged.length;i++)
		{
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
