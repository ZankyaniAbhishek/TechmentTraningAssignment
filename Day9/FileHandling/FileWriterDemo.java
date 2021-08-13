package com.Techment.Day9.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write("Hello \n");
		fw.write("Wecome to New Line \n");
		fw.write(92);
		System.out.println("Written Sucessfull");		fw.close();
	}

}
