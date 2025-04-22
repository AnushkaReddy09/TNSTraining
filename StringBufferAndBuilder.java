package com.Tnsif.Strings;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		//String buffer
		StringBuffer sb = new StringBuffer();
		String name = "Anushka";
		String Name = "Anushka";
		
		System.out.println(sb.append("hai "+name));
		
		
		if(name.equals(Name)) {
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		//String Builder
		StringBuilder b = new StringBuilder();
		System.out.println(b.append("welcome"));
		System.out.println(b.replace(0, 7, "world"));
		System.out.println(b.capacity());

	}

}
