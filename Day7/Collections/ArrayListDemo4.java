package com.Techment.Day7.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList();
		ArrayList a3 = new ArrayList();
		ArrayList a4 = new ArrayList();
		ArrayList a2 = new ArrayList();
		a1.add("sachin");
		a1.add("manish");
		a1.add("ankit");
		a1.add("kumar");
		//a1.addAll("sourabh", "manish", "sachin", "ankit" ,"kumar");
		a2.add("sachin");
		a2.add("ravi");
		a2.add("kumar");
		a2.add("sowmya");
		//->merge batch1 and batch2 ,remove duplicates ,sort in ascending order
		a2.addAll(a1);
		for (Object element : a2) {
			if (!a3.contains(element)) {
				a3.add(element);
			}
		}
		Collections.sort(a3);
		System.out.println("After Merging Both The Array's : "+a2);
		//System.out.println("After Merging Both The Array's : "  );// +(a3.removeAll());
		System.out.println("After Merging Both The Array's : "+a3);
	}

	
}
