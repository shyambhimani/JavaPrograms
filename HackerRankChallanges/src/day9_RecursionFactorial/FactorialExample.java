/**
 * Copyright 2016 Shyam Bhimani
 */
package day9_RecursionFactorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialExample {

	// Factorial example using recursion 
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {

			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}
