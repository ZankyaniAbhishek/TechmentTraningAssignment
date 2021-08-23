package com.Techment.Day13.newfeatures;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> nums = new ArrayList<Integer>();
			nums.add(1);
			nums.add(10);
			nums.add(20);
			nums.add(15);
			nums.add(12);
			System.out.println(nums);
			System.out.println();
			nums.forEach(s->System.out.println(s));
			System.out.println();
			nums.forEach(System.out::println);
			System.out.println();
			System.out.println("After Sorting ");
			nums.stream().sorted().forEach(System.out::println);
			List<Integer> mysorted = nums.parallelStream().sorted().collect(Collectors.toList());
			System.out.println(mysorted);
			nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
			List<Integer> ReverseSorted = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			System.out.println();
			System.out.println(ReverseSorted);
			
	}

}
