package com.Techment.demo;
import java.util.*;

public class Assigmentquetionnumber3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Weight Of First Horse");
		float horse1weight = sc.nextFloat();
		System.out.println("Enter The Weight Of Second Horse");
		float horse2weight = sc.nextFloat();
		System.out.println("Enter The Weight Of Third Horse");
		float horse3weight = sc.nextFloat();
		if(horse1weight>horse2weight && horse1weight>horse3weight)
			System.out.println("Weight Of Horse 1 Is Maximum");
		else if(horse2weight>horse3weight && horse2weight>horse1weight)
			System.out.println("Weight Of Horse 2 Is Maximum");
		else if(horse3weight>horse2weight && horse3weight>horse1weight)
			System.out.println("Weight Of Horse 3 Is Maximum");
		else if((horse3weight==horse2weight && horse3weight>horse1weight )
				||(horse1weight==horse2weight && horse1weight>horse3weight)
				||(horse3weight==horse1weight && horse3weight>horse2weight )  )
			System.out.println("Weight Of Horses Are Not Distinct");
	}

}
