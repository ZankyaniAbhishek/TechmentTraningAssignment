package com.Techment.Day7.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ol = new ArrayList<Integer>();
ol.add(1);
ol.add(11);
ol.add(12);
ol.add(13);
ol.add(14);
System.out.println("Elements in the list is "+ol);
Iterator<Integer> itr = ol.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
		
	}

}
