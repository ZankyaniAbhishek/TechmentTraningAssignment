package com.Techment.Collection.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class AssignmentQuestion5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedHashSet hashSet =  new LinkedHashSet();
		
		
		System.out.println("============================================Total States in File==========================================");
		Set<String> data = new LinkedHashSet<String>();
		FileReader fr = new FileReader("D:\\JAVA\\states.txt"); 
		BufferedReader br = new BufferedReader(fr); 
		String line = br.readLine();	
		System.out.println("Total Number Of States Are : "+(line.length()+1));
		System.out.println("-=-=-=-=-=-=---=--=-=-==--==-=-=--=-====---=-===-==-=-=-=-=-=--=-=--===-=-");
		data.remove("Delhi");
		
		
		while(line!=null)
		{		
			hashSet.add(line);
			System.out.println("*"+line);
			data.add(line); 
			line = br.readLine();
		}
		System.out.println("===========================================================================");		
		System.out.println("states which have name starting with K Are : ");
		for(String state: data )
		{
			if(state.startsWith("k")||state.startsWith("K"))
				System.out.println(state);
			//System.out.println(state.startsWith("k")); 
		}
		System.out.println("-----------------------------------------------------------------");
		ArrayList<String> list = new ArrayList<String>(data);
		Collections.sort(list);
		System.out.println(list);
		fr.close();
	}

}



