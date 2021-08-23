package com.Techment.day14.ClassTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Person
{
	String Name;
	int age ;
	public Person(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class VoteEligibility {

	public static void main(String[] args) {
		
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		Person p1 =new Person("Aman", 20);
		Person p2 =new Person("Karan", 21);
		Person p3 =new Person("Naitik", 17);
		Person p4 =new Person("Abhishek", 15);
		map.put(1, p1);
		map.put(2, p2);
		map.put(3, p3);
		map.put(4, p4);
		
		VoteEligibility eligibility = new VoteEligibility();
		eligibility.Eligible(map);
	}
	void Eligible(Map<Integer, Person> m)
	{
		List<String> list = new ArrayList<String>();
		for(Person p : m.values())
		{
			if(p.getAge()>18)
				list.add(p.getName());
				
		}
		for(String s :list)
			System.out.println(s);
	}
}
