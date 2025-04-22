package com.Tnsif.Collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueAndDQ {

	public static void main(String[] args) {
		
		//Linked List
		Queue<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println("Linked list: "+ll);
		
		ll.remove(); //FIFO
		System.out.println("After removing: "+ll);
		for(int a:ll) {
			System.out.println("The elements in the Linked list: "+a);
		}
		
		//Priority Queue
        Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(91);    //gives sorted sequence of elements
		pq.add(23);
		pq.add(3);
		pq.add(71);
		pq.add(55);
		System.out.println("PriorityQueue: "+pq);
		
		pq.remove(23); 
		System.out.println("After removing: "+pq);
		for(int b:pq) {
			System.out.println("The elements in the PriorityQueue: "+b);
		}
		
		//Dequeue : ArrayDequeue
		Queue<Character> aq = new ArrayDeque<>();
		aq.add('A');
		aq.add('N');
		aq.add('U');
		aq.add('S');
		aq.add('H');
		aq.add('K');
		aq.add('A');
		aq.add('M');
		System.out.println("ArrayDeQueue: "+aq);
		
		aq.remove('M');
		System.out.println("New ArrayDeQueue: "+aq);
		
			

	}

}
