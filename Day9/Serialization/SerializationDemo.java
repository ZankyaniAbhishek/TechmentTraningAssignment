package com.Techment.Day9.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	transient String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
	
		Employee emp1 = new Employee(1, "Sachin");
		System.out.println("================Started======================");
		FileOutputStream fos = new FileOutputStream("hello.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("==========================COmpleted==============```````````````````````");
	}

}
