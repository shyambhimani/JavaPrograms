/**
 * Copyright 2016 Shyam Bhimani
 */

package day20_sortingArray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class BubbleSortExample {
    
   /* public static int swap(a[i], a[i+1]){
        int temp1 = 0;
        int temp2 = 0;
        int tempSwap;
        temp1 = a[i];
        temp2 = a[i+1];
        if (a[i] < a[i+1]){
            tempSwap = temp1;
            temp1 = temp2;
            temp2 = tempSwap;
        }
        
        return (temp1, temp2)
    } */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numSwap = 0;
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            
        }
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j <= n -1; j++){
                 if (a[i] > a[j]){
                
                numSwap++;
            
            }
                
            }            
           
            
        } 
        
        Arrays.sort(a);
        System.out.println("Array is sorted in " + numSwap + " swaps.");
        System.out.println("First Element: " + a[0] );
        
        System.out.println("Last Element: " + a[a.length-1] );
        
        
        
    }
}
