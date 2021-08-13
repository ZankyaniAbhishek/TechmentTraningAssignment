package com.Techment.Day7.Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj = new ArrayList();
		System.out.println("size before Adding Elements : "+obj.size());
		obj.add(1);
		obj.add("Ram");
		obj.add(24.05);

		System.out.println("size before Adding Elements : "+obj.size());
		System.out.println("ELement in the list : "+obj);
		
		obj.add(1,"hello");
		System.out.println("ELement in the list : "+obj);
		
		obj.remove(Integer.valueOf(1));
		
		System.out.println("ELement in the list : "+obj);
		obj.remove(0);
		System.out.println("ELement in the list : "+obj);
		System.out.println("element at index 2 is : " + obj.get(1));
	}

}
