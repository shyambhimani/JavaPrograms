/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package tempPrac;

import java.util.Arrays;

public class Solution3 {

	public static void checkMatch(int[] arr) {

		int rightSum = 0;
		int leftSum = 0;
		
		System.out.println(Arrays.toString(arr));

		for (int elementAtIndex = 1; elementAtIndex < arr.length; elementAtIndex++) {
			
			rightSum = 0;
			leftSum = 0;
			
				for (int i = elementAtIndex - 1; i >= 0; i--) {

					rightSum += arr[i];
					
				}

				System.out.println(rightSum);

				for (int i = elementAtIndex + 1; i < arr.length; i++) {

					leftSum += arr[i];

				}

				System.out.println(leftSum);

				if (leftSum == rightSum) {

					System.out.println("match found at: " + elementAtIndex);
					break;
				} else {
	
				}	

		}// j loop
		
	}

	public static void main(String[] args) {

		int arr[] = new int[15];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 3;
		arr[4] = 2;
		arr[5] = -5;
		arr[6] = -10;
		arr[7] = -20;
		arr[8] = 5;
		arr[9] = 10;
		arr[10] = 5;
		arr[11] = 5;
		arr[12] = 5;
		arr[13] = 10;
		arr[14] = 10;

		checkMatch(arr);

	}

}
