package com.apex.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub		
		

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(2, "Hello");
		hm.put(3, "fremont");
		hm.put(1, "Games");
		hm.put(null, null);
		
		for(Map.Entry m: hm.entrySet()){
			System.out.println("" + m.getKey() + " " + m.getValue());
		}
		
		
		for(int x:hm.keySet())
		{
			System.out.println(x);
		}
		
		for(String str:hm.values()){
			System.out.println(str);
		}
		
	}

}