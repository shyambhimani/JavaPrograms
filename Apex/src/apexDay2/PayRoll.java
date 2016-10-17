/* Exercise 1:
Create a payroll program for the part-time employee. 
display no of hours he/she worked, pay rate value and pay rate per month.

Input: no of hours he/she worked and pay rate value per hour
output: display both input values and salary of the person per month
Hint: create 3 double variables hours_wrked, pay rate and use multiplication operation

*/

package apexDay2;

import java.util.*;

public class PayRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Takes user input and store in hoursWorked
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter number of hours employee worked");
		double hoursWorked = sc.nextDouble();
		
		//Takes user input and store in ratePerHour
		System.out.println("Please enter pay rate per hour: ");
		double ratePerHour = sc.nextDouble();
		
		//Print total hours worked
		System.out.println("Total hours worked: " + hoursWorked);
		//Print salary per hour
		System.out.println("Pay rate per houre is: " + ratePerHour);
		//Calculate total salary 
		System.out.println("Your total salary is: " + hoursWorked*ratePerHour);

	}

}
