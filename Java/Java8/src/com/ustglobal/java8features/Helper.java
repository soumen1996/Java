package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Marks is "+s.percentage);
			System.out.println("===========");
		}
	}
	
	void displayFailedStudent(ArrayList<Student> al) {
		List< Student> l =al.stream().filter(student -> student.percentage<40).collect(Collectors.toList());
		
		Iterator<Student> itr = l.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Marks is "+s.percentage);
			System.out.println("===========");
	}

}
	
	void displayPassedStudent(ArrayList<Student> al) {
		List< Student> li =al.stream().filter(student -> student.percentage>40).collect(Collectors.toList());
		
		Iterator<Student> itr = li.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Marks is "+s.percentage);
			System.out.println("===========");
	}

}
		void topperOfClass(ArrayList<Student> al) {
			
			Comparator<Student> cmp = (std1,std2) ->{
				if(std1.percentage>std2.percentage) {
					return 1;
				}else if(std1.percentage<std2.percentage){
					return -1;
				}
				else
				{
					return 0;
				}
			};
			
			
			Student l = al.stream().max(cmp).get();
			
				System.out.println("Id is "+l.id);
				System.out.println("Name is "+l.name);
				System.out.println("Marks is "+l.percentage);
				System.out.println("===========");
		}

			
		}
		
			
	
	

