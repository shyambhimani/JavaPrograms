package thirtyDaysChallange;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class DecimalToBinary {

	public static void toBinary(int n) {
		 
		    int rem=0,s=0,t=0;


		    while(n>0)
		        {
		        rem=n%2;
		        n=n/2;
		        if(rem==1)
		         {   s++;
		           if(s>=t)

		            t=s;

		        }
		        else{

		            s=0;
		        }   
		    }

		    System.out.println(t);
		}
		
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		toBinary(n);
	}

}