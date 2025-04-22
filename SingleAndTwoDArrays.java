package com.Tnsif.Arrays;

import java.util.Scanner;

public class SingleAndTwoDArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the Array Elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
		System.out.println("Single Dimensional Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//2D Array
		System.out.println("Enter the size of Matrix(Row & Column):");
		int M = sc.nextInt();
		int N = sc.nextInt();
		int Ar[][]=new int[M][N];
		
		System.out.println("Enter The Elements: ");
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				Ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Two Dimensional Array: ");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<M;j++) {
				System.out.print(Ar[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}


