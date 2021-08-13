package com.Techment.Collection.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyser
{
	
	private LinkedList<Integer> runsData  = new LinkedList<Integer>();

	public ScoreAnalyser(LinkedList runsData) {
		super();
		this.runsData = runsData;
	}
	
	public void Runlist()
	{
		System.out.print("Runs Scored : ");
		for(Integer i : runsData)
		{
			System.out.print(i + " ");
		}
	}
	
	public void RunRate()
	{System.out.println();
		double avg;Integer highest=0;
		for(Integer i : runsData)
		{
			highest=highest+i;
		} 
		avg = 1.0f * highest / 50;
			System.out.println("Runrate is are : "+avg);
	}
	
	public void LowestRuns()
	{
		System.out.println("Minimum Scored Runs Are :" + Collections.min(runsData));
	}
	
	
}
public class AssignmentQuestion2 {

	public static void main(String[] args) {		
		
		//now tell me how can i get the 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The The Number Of Players  : ");
		int number = scanner.nextInt();
		LinkedList<Integer> list  = new LinkedList<Integer>();

		//ArrayList<Integer>  = new ArrayList<Integer>();
		for(int i =0;i<number;i++)
		{
			System.out.println("Enter the "+(i+1)+ " Player Score : ");
			list.add(scanner.nextInt());
		}
		ScoreAnalyser analyser = new ScoreAnalyser(list);
		System.out.println("======================Output============================");
		analyser.Runlist();
		analyser.RunRate();
		analyser.LowestRuns();
		System.out.println("Number Of Players Batted : "+number);
		System.out.println("================================Done====================");
		
	}

}
