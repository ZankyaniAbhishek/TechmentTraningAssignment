package com.Techment.Day12.NewFeatures;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2Demo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =1;i<=10;i++)
		{
			numbers.add(i);
		}
		System.out.println("Numbers  : "+numbers);
		System.out.println("Printing only even Numbers");
		numbers.stream().filter(num ->num%2==0).forEach(s->System.out.println(s));
		
		System.out.println("By using Map : ");
		numbers.stream().map(num->"After Adding 100 " +(num+100)).forEach(s->System.out.println(s));
		numbers.stream().map(num->(num+5)).forEach(s->System.out.println(s));
		
		 numbers.stream().limit(4).forEach(i->System.out.println(i));
		 numbers.stream().skip(4).forEach(i->System.out.println(i));
		 
		 Long size = numbers.stream().count();
		 System.out.println("No of elements : "+ size);
		//List<Integer> nu = Arrays.asList(a)
	}

}
