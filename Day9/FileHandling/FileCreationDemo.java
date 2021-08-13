package com.Techment.Day9.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("exam");
		System.out.println(file.exists());
		//file.createNewFile();//Create a File
		file.mkdir();
		System.out.println(file.exists());
		
		

	}

}
