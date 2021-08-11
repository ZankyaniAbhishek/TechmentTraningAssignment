package com.Techment.Day8.Collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("sachin", "sachin is a batsman");
		hm.put("dravid", "dravid is a wicket keeper");
		hm.put("dhoni", "dhoni is a captain");
		hm.put("rahane", "he is a batsman");
		hm.put("dravid", "dravid is a coach");
		
		System.out.println("hash map : "+hm);
		for(java.util.Map.Entry<String, String> e : hm.entrySet())
		{
			System.out.print("Key : " + e.getKey());
			System.out.print("  , Values : " + e.getValue());
			System.out.println();
		}
		System.out.println();
		System.out.println("Printing Key :");
		for (String m :hm.keySet())
		{
			System.out.println(m);
		}
System.out.println();
		System.out.println("Printing Values :");
		for (String m :hm.values())
		{
			System.out.println(m);
		}

	}

}
