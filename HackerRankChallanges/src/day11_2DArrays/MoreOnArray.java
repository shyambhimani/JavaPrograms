/**
 * Copyright 2016 Shyam Bhimani
 */
package day11_2DArrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MoreOnArray {
	
	public static void maxHourGlass(int arr[][]){
		int sum[] = new int[16];
		int h = 0;
		for (int row = 0; row < 4; row++){
			for (int col = 0; col < 4 ; col++){
				sum[h] = arr[row][col] + arr[row][col+1] + arr[row][col+2] +
						arr[row+1][col+1] +
						arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
				h++;
				
			}
					
		}
		Arrays.sort(sum);
		System.out.println(sum[15]);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                
            }
            
        }
        
        maxHourGlass(arr);
        
        
        
        
    }
}
