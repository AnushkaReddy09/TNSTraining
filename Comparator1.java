package com.Tnsif.Collections;
import java.util.*;
import java.util.List;

class Student{
	int marks;
	Student(int marks){
		this.marks = marks;
	}

@Override
public String toString() {

	return "Student Marks are:" +marks;
}
}

class TComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.marks - s2.marks; //Ascending & Descending(s2 - s1)
		
	}
}

public class Comparator1 {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		al.add(new Student(100));
		al.add(new Student(90));
		al.add(new Student(75));
		al.add(new Student(95));
		
		Collections.sort(al, new TComparator());
		
		for(Student s : al) {
			System.out.println(s);
			}
		
		

	}

}
