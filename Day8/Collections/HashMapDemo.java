package com.Techment.Day8.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(6, "Ramu");
		hm.put(8, "Ram");
		hm.put(3, "Sachin");
		hm.put(4, "Sonu");
		hm.put(5, "Monu");
		hm.put(7, "Ramu");
		hm.put(9, "Ram");
		hm.put(2, "Sachin");
		hm.put(1, "Sonu");
		//hm.put(1, "Monu");
		
		System.out.println("Has Map : "+hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(6, "Ramu");
		lhm.put(8, "Ram");
		lhm.put(3, "Sachin");
		lhm.put(4, "Sonu");
		lhm.put(5, "Monu");
		lhm.put(7, "Ramu");
		lhm.put(9, "Ram");
		lhm.put(2, "Sachin");
		lhm.put(1, "Sonu");
		//hm.put(1, "Monu");
		
		System.out.println("Linked Has Map : "+lhm);
		
		TreeMap ts = new TreeMap();
		ts.put(6, "Ramu");
		ts.put(8, "Ram");
		ts.put(3, "Sachin");
		ts.put(4, "Sonu");
		ts.put(5, "Monu");
		ts.put(7, "Ramu");
		ts.put(9, "Ram");
		ts.put(2, "Sachin");
		ts.put(1, "Sonu");		//ts.add("Sachin");

		System.out.println("Tree Set :" + ts);

	}

}
