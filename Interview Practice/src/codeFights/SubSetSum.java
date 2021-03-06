/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package codeFights;

public class SubSetSum {

	public static boolean subsetSum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		if (sum % 2 != 0) {
			return false;
		}

		boolean part[][] = new boolean[sum / 2 + 1][arr.length + 1];

		for (int i = 0; i <= arr.length; i++) {
			part[0][i] = true;
		}

		for (int i = 1; i < sum / 2; i++) {
			part[i][0] = false;
		}

		for (int i = 1; i <= sum / 2; i++) {

			for (int j = 1; j <= arr.length; j++) {
				part[i][j] = part[i][j - 1];
				if (i >= arr[j - 1]) {
					part[i][j] = part[i][j] || part[i - arr[j - 1]][j - 1];
				}

			}
		}

		// if (arr.length >= 3 && arr.length <= 100){

		// for (int i = 0; i < arr.length; i++){
		// int temp = 0;
		// for (int j = i + 1; j < arr.length; j++ ){

		// temp += j;
		// }

		// if (arr[i] == temp){
		// return result = true;
		// }
		// }
		// }

		return part[sum / 2][arr.length];

	}

	public static void main(String[] args) {

		int arr[] = { 3, 1, 1, 2, 2, 1 };
		if (subsetSum(arr) == true) {
			System.out.println("Can be divided into two " + "subsets of equal sum");
		} else {
			System.out.println("Can not be divided into" + " two subsets of equal sum");

		}

	}
}
