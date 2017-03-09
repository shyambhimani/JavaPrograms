/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package codeFights;

public class FindNumber {

	/**
	 * 1 = 123, 2 = 456, 3 = 789, 4 = 101112, 5 = 131415....
	 */

	public static int findNumber(int n) {

		String result = "";
		int startingNumber = ((n - 1) * 3) + 1;
		int finalResult = 0;

		if (n >= 0 && n <= 100) {
			if (n == 0) {
				return 0;
			}
			for (int i = 1; i <= 3; i++) {

				result += Integer.toString(startingNumber);
				startingNumber++;

			}

			finalResult = Integer.valueOf(result);

		}

		return finalResult;

	}

	public static void main(String[] args) {
		
		System.out.println(findNumber(30) );

	}

}
