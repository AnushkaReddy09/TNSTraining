package com.Tnsif.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {
		//List
		List<Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(2004);
		a.add(4);
		a.add(2005);
		for(int AL:a) {
		System.out.println("The elements are: " +AL);
		}
		
		//set
		Set<String> b = new HashSet<String>();
		b.add("Chocolate");
		b.add("Icecream");
		b.add("Biryani");
		b.add("Momos");
		b.add("Icecream");
		
		for(String food:b) {
			System.out.println("The Food items are: " +food);
			}
		
	}

}
