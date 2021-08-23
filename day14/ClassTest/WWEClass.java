package com.Techment.day14.ClassTest;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Wrestler
{
	private String firstName;
	private String LastName;
	private int Weight;
	public Wrestler(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		Weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	@Override
	public String toString() {
		return "Wrestler :- Name=" + firstName + " " + LastName + ", Weight : " + Weight + " ";
	}
	
	
}

public class WWEClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Wrestler wrestler1 = new Wrestler("Ram", "Jain", 120);
			Wrestler wrestler2 = new Wrestler("jayant", "Mishra", 150);
			Wrestler wrestler3 = new Wrestler("Chetan", "Kumar", 280);
			Wrestler wrestler4 = new Wrestler("Raghav", "Sahu", 330);
			Wrestler wrestler5 = new Wrestler("SUnil", "Tiwari", 290);
			List<Wrestler> wrestlers = new ArrayList<Wrestler>();
			wrestlers.add(wrestler5);
			wrestlers.add(wrestler4);
			wrestlers.add(wrestler3);
			wrestlers.add(wrestler2);
			wrestlers.add(wrestler1);
			
			WWEClass wweClass = new WWEClass();
			wweClass.countnumber(wrestlers);
			wweClass.summingweight200plus(wrestlers);
			wweClass.firstname(wrestlers);
			
	}
		void countnumber(List<Wrestler> w)
		{
			System.out.println("Number Of Wrestlers Are : " +w.stream().count());
		}
		void summingweight200plus(List<Wrestler> w)
		{
			System.out.println(w.stream().filter(e->e.getWeight()>200).collect(Collectors.summarizingInt(Wrestler::getWeight)).getSum());
		}
		void firstname(List<Wrestler> w)
		{
			w.stream().map(e->e.getFirstName()).forEach(System.out::println);
		}
		void minimumweight(List<Wrestler> w)
		{
			System.out.println(w.stream().collect(Collectors.summarizingInt(Wrestler::getWeight)).getMin());
		}
}
