package com.Techment.Day7.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ol = new ArrayList();
		ol.add(1);
		ol.add(2);
		ol.add(3);
		ol.add(4);
		ol.add(5);
		System.out.println("Elements in Array Are : "+ol);
		
		ArrayList o2 = new ArrayList();
		
		o2.add(101);
		o2.add(102);
		o2.add(103);
		o2.add(4);
		o2.add(5);
		Collections.sort(o2);
		//o2.addAll(ol);
	
		
		System.out.println("Elements in Array Are : "+o2);
//		//o2.removeAll(ol);
		//System.out.println("Elements in Array Are : "+o2);
		
		o2.retainAll(ol);
		System.out.println("Elements in Array Are : "+o2);

	}

}
