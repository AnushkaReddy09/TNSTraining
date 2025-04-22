package com.Tnsif.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		
		//Hash map
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "int");
		hm.put(2, "float");
		hm.put(3, "double");
		hm.put(4, "string");
		hm.put(5, "character");
		System.out.println(hm);
		hm.remove(5);
		System.out.println("The elements oh HASH MAP are:"+hm);
		
		//linked Hash map
		HashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("Sita",1);
		lhm.put("gita",2);
		lhm.put("Sheela",3);
		lhm.put("Mala",4);
		lhm.put("Priya",5);
		System.out.println(lhm);
		lhm.remove("Priya");
		System.out.println("The elements of Linked Hash map are:"+lhm);	
		
		//Tree Map
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("Sita",1);
		tm.put("gita",2);
		tm.put("Sheela",3);
		tm.put("Mala",4);
		tm.put("Priya",5);
		System.out.println(tm);
		tm.remove("Priya");
		System.out.println("The elements of Tree map are:"+tm);
		
		//Hash Table
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(1, "Studying");
		ht.put(2, "is");
		ht.put(3, "Anushka");
		ht.put(4, "in");
		System.out.println(ht);
		ht.remove(4);
		System.out.println("The elements of Hash Table are:"+ht);
		
		

	}

}
