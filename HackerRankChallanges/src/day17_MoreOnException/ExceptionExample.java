/**
 * Copyright 2016 Shyam Bhimani
 */

package day17_MoreOnException;


import java.util.Scanner;



public class ExceptionExample extends Exception {
	 int n, p;
	 String message = "n and p should be non-negative";

	public ExceptionExample() {

	}



	public String getMessage() {
		return message ;
	}

	public int power(int n, int p) throws ExceptionExample {
		int power = 0;
		if (n >= 0 && p >= 0) {
			this.n = n;
			this.p = p;
			power = (int) Math.pow(n, p);

		} else {

			throw new ExceptionExample();

		}

		return power;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		while (T-- > 0) {	
			int n = in.nextInt();
			int p = in.nextInt();
			ExceptionExample myCalculator = new ExceptionExample();
			
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
