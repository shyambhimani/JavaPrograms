/* Exercise 2:
Find result for the following quadraticEquation
s quadratic equation is 3*X^2 - 8*X + 4. 
give different values to X and run the program and display the result
Input: integer value for x

Output: result after substituting the x value.
e.g: 
input: 1
 output: -1 
explanation: 3*1*1 - 8*1 + 4 = -1

*/

package apexDay2;

import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please exter value of X : ");

		// Taking input from user and storing in variable x
		int x = sc.nextInt();
		int y;
		y = 3 * x * x - 8 * x + 4;

		// Printing result of Quadratic equation
		System.out.println("When X = " + x + " value of Quadratic Equation after simplification = " + y);

	}

}
