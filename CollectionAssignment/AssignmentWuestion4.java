package com.Techment.Collection.Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class Patient implements Comparable<Patient>
{
	private int Patientid;
	private String Name;
	private int Age;
	public Patient(int patientid, String name, int age) {
		super();
		
		setPatientid(patientid);
		setName(name);
		setAge(age);
		
	}
	public int getPatientid() {
		return Patientid;
	}
	public void setPatientid(int patientid) {
		Patientid = patientid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public int compareTo(Patient o) {
		if(Age>o.Age)
			return 1;
		else if(o.getAge()==Age)
		return 0;
		else
		return -1;
	}
	@Override
	public String toString() {
		return "Patient [Patientid=" + Patientid + ", Name=" + Name + ", Age=" + Age + "]";
	}
	
}
class NameSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class AgeSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		if(o1.getAge()>o2.getAge())
			return 1;
		else if(o1.getAge()>o2.getAge())
			return 0;
		else
			return -1;
	}
	
}
public class AssignmentWuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patient> patients = new ArrayList<Patient>();
		
		Patient patient1 = new Patient(1, "RAJ", 12);
		Patient patient2 = new Patient(2, "Sajan", 13);
		Patient patient3 = new Patient(3, "Dhiraj", 14);
		Patient patient4 = new Patient(4, "Rakesh", 10);
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		System.out.println("=========================Sorting By Name =============================================");
		Collections.sort(patients,new NameSorting());
		for(Patient p : patients)
		{	
			System.out.println("Name : " + p.getName()+" Age: "+p.getAge()+" Id: "+p.getPatientid());
			
		}
		System.out.println("============================Sorting By Age=============================================");
		//YAha AArha h error
		Collections.sort(patients);
		Iterator<Patient> itr = patients.iterator();
		while(itr.hasNext())
			//System.out.println(" "+itr.next().getAge()+" Name : "+itr.next().getName()+ " " +itr.next().getPatientid());
			{System.out.println(itr.next());
			//set.add(itr.next());
		
			}
		/*
		
		
		for(Patient p : patients)
		{
			//set.add(p);
			System.out.println("Age : "+ p.getAge()+" Name:  "+p.getName()+" Id: "+p.getPatientid());
		
		}*/
		
		
		System.out.println("=================================================Set=======================================");
		System.out.println(patients.size());
	
		TreeSet<Patient>patientset=new TreeSet<Patient>(patients);
		for(Patient p :patientset)
			System.out.println(p);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Name Want to find the Age : ");
		String name = scanner.next();
		getPatientAge(name, patientset);
		//System.out.println("Sorting using TreeSet"+patientset);


	}
	
	public static void getPatientAge(String name, TreeSet<Patient> set)
	{
		for(Patient p :set)
			if(p.getName().matches(name))
				System.out.println("The Age of "+name + " is : "+p.getAge());
			
	}

}
