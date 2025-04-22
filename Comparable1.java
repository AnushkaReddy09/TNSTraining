package com.Tnsif.Collections;

import java.util.*;
import java.util.List;

class StudentA implements Comparable<StudentA>{
	int marks;
	
	StudentA(int marks){
		this.marks = marks;	
	}
	
	//public int compareTo(StudentA other) { //Descending order
	//	return other.marks - this.marks;
	//}
	
	public int compareTo(StudentA other) { //Ascending order
		return this.marks - other.marks;
	}
	public String toString() {
		return "Student Marks:" + marks;
	}
}

public class Comparable1 {

	public static void main(String[] args) {
		List<StudentA> l = new ArrayList<>();
		l.add(new StudentA(70));
		l.add(new StudentA(50));
		l.add(new StudentA(90));
		l.add(new StudentA(89));
		
		Collections.sort(l);
		for(StudentA Marks : l) {
		System.out.println(Marks);
		}
	}

}
