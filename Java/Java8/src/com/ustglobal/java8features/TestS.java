package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student(1, "Priyanka", 45);
		Student s2 = new Student(2, "Soumen", 60);
		Student s3 = new Student(3, "Pawan", 78);
		Student s4 = new Student(4, "Anushka", 88);
		Student s5 = new Student(5, "ReshuRani", 35);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
		h.displayFailedStudent(al);
		
		h.displayPassedStudent(al);
		h.topperOfClass(al);
	}

}
