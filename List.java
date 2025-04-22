package com.Tnsif.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List {

	public static void main(String[] args) {
		//1.Array List
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(20);
		alist.add(40);
		alist.add(60);
		alist.addFirst(99);
		alist.addLast(111);
		System.out.println("The elements are: " + alist);
		alist.remove(2);
		System.out.println("The updated array list is:" + alist);
		
		//2.Linked List
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(null);
		ll.add(20);
		ll.add(40);
		ll.add(60);
		ll.addFirst(99);
		ll.addLast(111);
		
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println("The elements are: " + it.next());
		}
		
		//3.vector
		Vector<String> vl= new Vector<>();
		vl.add("Anu");
		vl.add("Mugala");
		vl.addLast("Reddy");
		
		System.out.println("Name : " + vl);
		
		vl.remove(0);
		vl.remove(1);
		vl.add("Anushka");
		vl.addLast("Reddy");
		
		System.out.print("My Name is : "+vl);
		System.out.println();
		
		//4.Stack
		Stack<String> s = new Stack<>();
		s.push("Who");
		s.push("is");
		s.push("the");
		s.push("Prettiest");
		s.push("Girl?");
		
		System.out.print("Answer this Question:" + s);
		s.pop();   //LIFO
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		s.push("Anushka Reddy");
		System.out.println();
		System.out.println("The prettiest girl is: "+s);		

	}

}
