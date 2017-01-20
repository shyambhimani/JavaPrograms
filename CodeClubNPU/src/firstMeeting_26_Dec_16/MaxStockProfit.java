/**
 * Copyright 2016 Shyam Bhimani
 */

package firstMeeting_26_Dec_16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxStockProfit {
	
	
	public static int bestProfit(int[] arr){
		int maxProfit = 0;
		
		// It will find the max profit
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] - arr[i] > maxProfit) {
					maxProfit = arr[j] - arr[i];
				}
			}

		}
		
		
		
		return maxProfit;
		
	}


	// Method to calculate Best profit.
	public static int bestProfitImprovedMethod(int[] arr) {
		
		LinkedList newArr = new LinkedList(Arrays.asList(arr));
		int maxProfit = 0;
		int min = arr[0];
		int max = 0;
		int minIndex = arr.length - 1;
		int maxIndex = 0;
		int i = 0;
		int j = 0;
		
		Iterator iterator = newArr.iterator();	
		while(iterator.hasNext()){
			
		//for (int i = 0; i < newArr.size(); i++){
			if (arr[i] < min ){
				if (newArr.indexOf(i) < minIndex){
					minIndex = newArr.indexOf(i);
					min = arr[i];
					iterator.next();
				}
			}
			i++;
			iterator.next();
			
		}
		while(iterator.hasNext()){
		
		//for (int j = 0; j < newArr.size(); j++){
			if (arr[j] > max) {
				if (newArr.indexOf(iterator.next()) > maxIndex){
					maxIndex = newArr.indexOf(j);
					max = arr[j];
					iterator.next();
					j++;
					
				}
			}
			
			j++;
			iterator.next();
		}
		
		
		maxProfit = max - min;
		
		

//		// It will find the max profit
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr.length - 1; j > i; j--) {
//				if (arr[j] - arr[i] > maxProfit) {
//					maxProfit = arr[j] - arr[i];
//				}
//
//			}
//
//		}

		return maxProfit;
	}

	public static void main(String[] args) {
		// Scanner class's sc object to take user input
		Scanner sc = new Scanner(System.in);

		// How many input price user wants to provide?
		System.out.println("Enter the number of quotes you would like to enter for Apple stock? :");
		int n = sc.nextInt();

		// Array of price
		int[] arr = new int[n];

		// Storing user input of price in array arr.
		for (int i = 0; i < n; i++) {
			System.out.println("Enter price " + (i + 1) + " : ");
			arr[i] = sc.nextInt();

		}
		System.out.println("You could have earned maximum yesterday in Apple stock: $" + bestProfit(arr));
		System.out.println("Improved func: " + bestProfitImprovedMethod(arr));

	}

}
