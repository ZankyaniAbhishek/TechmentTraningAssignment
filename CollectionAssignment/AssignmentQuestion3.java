package com.Techment.Collection.Assignment;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AssignmentQuestion3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	HashMap<String, Integer> ScoreCard = new HashMap<String, Integer>();
	int highest =0;
	String name=null;
	System.out.println("Enter The number of players to Add Score : ");
	int number = scanner.nextInt();
	for (int i =0;i<number;i++)
	{
		System.out.println("Enter The Player Name : ");
		String s = scanner.next();
		System.out.println("Enter The Runs Scored By Player : ");
		int c = scanner.nextInt();
		ScoreCard.put(s, c);
	}
	int total=0;
	System.out.println("=================================Players Who Bated :-=================================================================");
	for(String string : ScoreCard.keySet())
		{System.out.println(string);
		
		}
	System.out.println("=========================================Scores By Players :-=============================================================");
	for(Entry<String, Integer> e : ScoreCard.entrySet())
	{
		System.out.println(e.getKey() + " : "+e.getValue());
		total+=e.getValue();
		if(highest<e.getValue())
		{
			highest=e.getValue();
			name = e.getKey();
		}
	}
	System.out.println("================================================");
	System.out.println("Total Score : "+total);
	System.out.println("Highest Scored Scored is :"+ highest);
	//System.out.println("Highest SCored SCored By : "  +name);
	System.out.println("Highest Scored Player : " + name);
	scanner.close();
		
}
}
