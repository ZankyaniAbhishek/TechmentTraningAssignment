package com.Techment.Collection.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class AssignmentQuedstion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer highest=0;
		double avg=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The The Number Of Student  : ");
		int number = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<number;i++)
		{
			System.out.println("Enter the "+(i+1)+ " Student Marks: ");
			list.add(scanner.nextInt());
		}
		System.out.println("Highest Marks :" + Collections.max(list));
		for(Integer i : list)
		{
			highest=highest+i;
		} 
		avg = 1.0f * highest / list.size();
		//Getting The Average Marks	
		System.out.println("Average Marks are : "+avg);
		
	//	System.out.println();
		Iterator<Integer> itr1 = list.iterator();
		//Getting Marks
		System.out.print("Marks :  ");
		int j =1;
		while(itr1.hasNext())
		{	System.out.print(j+"-"+itr1.next()+" ");
			j++;			
		}
		
		System.out.println();
		if(list.size()>2)
		System.out.println("Third Student Marks : "+list.get(2));
	Collections.sort(list);
	Iterator<Integer> itr = list.iterator();
	int k =1;
	System.out.print("Marks After Sorting : ");
	while(itr.hasNext())
	{
		System.out.print(k+"-"+itr.next()+" ");
		k++;
		
	}
		
	}
	

}
