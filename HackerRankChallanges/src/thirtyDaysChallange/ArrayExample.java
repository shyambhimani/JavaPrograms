package thirtyDaysChallange;

import java.util.Scanner;

import java.io.*;
import java.util.*;


public class ArrayExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for (int i = n-1; i < arr.length; i--){
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}