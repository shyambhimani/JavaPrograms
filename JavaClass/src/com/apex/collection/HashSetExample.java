package com.apex.collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("Hello");
		h.add("World");
		h.add("Game");h.add("Game");
		//h.add(78);
		//h.add(89.0);
		
		for(String x: h){
			System.out.println(x);
		}
	}

}
