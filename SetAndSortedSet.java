package com.Tnsif.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetAndSortedSet {

	public static void main(String[] args) {
		
		//Hash Set
		HashSet<String> hs = new HashSet<>();
		hs.add("lenovo");
		hs.add("hp");
		hs.add("dell");
		hs.add("Mac");
		hs.add("Tree");
		System.out.println("HashSet :"+hs);
		
		hs.remove("Tree");
		System.out.println("Updated HashSet :"+hs);
		
		for(String h:hs) {
			System.out.println("The elements are:" + h);
		}
		
		//Linked HashSet
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(20);
		lh.add(22);
		lh.add(22);
		lh.add(19);
		lh.add(24);
		lh.add(29);
		System.out.println("Linked HashSet:"+lh);
		lh.remove(24);
		System.out.println("Updated Linked HashSet:"+lh);
		for(int l:lh) {
			System.out.println("The elements are:" + l);
		}
		
		//Tree set
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(40);
		ts.add(70);
		ts.add(19);
		ts.add(30);
		ts.add(50);
		System.out.println("Linked HashSet:"+ts);
		ts.remove(19);
		System.out.println("Updated Linked HashSet:"+ts);
		for(int t:ts) {
			System.out.println("The elements are:" + t);
		}
		
	}

}
