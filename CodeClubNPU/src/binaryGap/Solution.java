/**
 * Copyright 2016 Shyam Bhimani
 */

package binaryGap;

import java.util.Scanner;

public class Solution {

	public static int solution(int N) {
		int gap = 0;
		int maxGap = 0;

		String s = Integer.toBinaryString(N);

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '1') {

				gap = 0;

			} else if (s.charAt(i) == '0') {

				// System.out.println("else loop executed");

				gap += 1;

				if (maxGap < gap) {
					// System.out.println("Inner most loop executed");
					maxGap = gap;

				}

			}

		}

		return maxGap;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		int j = solution(1041);
		
		System.out.println(j);
		
		
		
		

	}

}
