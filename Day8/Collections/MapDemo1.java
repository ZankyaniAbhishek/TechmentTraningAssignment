package com.Techment.Day8.Collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "Sachin", 18);
		Student student1 = new Student(1, "Sachin", 18);
		
		System.out.println(student1.hashCode());
		System.out.println(student.hashCode());
		
		HashMap<Student,String> hm = new HashMap<Student, String>();
		hm.put((new Student(1, "Sachin", 19)), "Cse");
		hm.put((new Student(1, "Sachin", 19)), "Cse");
		
		for(java.util.Map.Entry<Student, String> stu : hm.entrySet())
		{
			System.out.println(stu + " " );
		}
		
	}

}
