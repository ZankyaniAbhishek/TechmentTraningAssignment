package com.Techment.Day7.Collections;

import java.util.LinkedList;

public class Linklistdedmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ol = new LinkedList();
ol.add(1);
ol.add(2);
ol.addFirst(100);

ol.add(20);
ol.addLast(500);
System.out.println("LinkedList :"+ol);
ol.removeLast();
System.out.println("LinkedList :"+ol);
	}

}
