/**
 * Copyright 2016 Shyam Bhimani
 */
package day19_Interface;

import java.util.Scanner;

public class Calculator implements AdvancedArithmetic {

	public int divisorSum(int n) {
		int temp1;
		int sum = 0;
		for (temp1 = 1; temp1 <= n; temp1++) {
			if (n % temp1 == 0) {
				sum += temp1;
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}
