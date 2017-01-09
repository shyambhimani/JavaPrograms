/**
 * Copyright 2016 Shyam Bhimani
 */

package binaryGap;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion2 {

	public static int solution(int[] A) {

		int maxDistance = 0;

		Arrays.sort(A);

		for (int i = 0; i < A.length - 1; i++) {
			

				if ((A[i+1] - A[i]) > maxDistance) {
					maxDistance = ((A[i+1] - A[i]) ) / 2 ;

				}
			

		}

		return maxDistance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] j = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			j[i] = sc.nextInt();
		}

		System.out.println(solution(j));

	}

}
