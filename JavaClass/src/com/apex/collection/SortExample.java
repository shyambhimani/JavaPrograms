package com.apex.collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	String name;
	int age,id;
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public int compareTo(Student st) {
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}

}

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student("John", 34, 45);
		al.add(s1);
		al.add(new Student("Mike", 26, 87));
		al.add(new Student("Michael", 10, 8));
		al.add(new Student("fremont", 20, 7));
		
		Collections.sort(al);
		
		for(Student s:al){
			System.out.println(s.age+" "+s.name+" "+s.id);
		}
		
	}

}
