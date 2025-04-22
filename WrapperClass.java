package com.Tnsif.WrapperClass;

//by using this wrapper class primitive data types can be directly used as objects
import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(20);
		array.add(15);
		array.addFirst(31);
		//array.add("Anu");
		
		//System.out.println("array"); - [15,20]
		for(int arr: array)
		System.out.println(arr); 
		

	}

}
