package com.Tnsif.Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reversing a string
		String str = "Hello";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String str1 = "Hello World";
		String reversed = new StringBuilder(str1).reverse().toString();
		System.out.println("The Reversed string is:"+reversed);

	}

}
