package com.Techment.Day8.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(22);
		hs.add(12);
		hs.add(55);
		hs.add(1);
		hs.add(26);
		
		System.out.println("HashSet : " +hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(22);
		lhs.add(12);
		lhs.add(55);
		lhs.add(1);
		lhs.add(26);
		lhs.add("Sachin");
		System.out.println("Linked hashSet : " + lhs);
		TreeSet ts = new TreeSet();
		ts.add(22);
		ts.add(12);
		ts.add(55);
		ts.add(1);
		ts.add(26);	
		//ts.add("Sachin");

		System.out.println("Tree Set :" + ts);
		//HashMap
		//Linkedhashmap
		//TreeMap
		
		

	}

}
