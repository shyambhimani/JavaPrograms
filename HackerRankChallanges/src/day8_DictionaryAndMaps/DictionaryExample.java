/**
 * Copyright 2016 Shyam Bhimani
 */
package day8_DictionaryAndMaps;

import java.util.*;
import java.io.*;

public class DictionaryExample {
	// Complete this code or write your own from scratch

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneDictionary = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// getting input in dictionary
			phoneDictionary.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Querying by user

			for (String key : phoneDictionary.keySet()) {
				key = s;
				if (phoneDictionary.get(key) != null) {
					System.out.println(key + "=" + phoneDictionary.get(key));
				} else {
					System.out.println("Not found");
				}
				break;
			}

		}
		in.close();
	}
}
