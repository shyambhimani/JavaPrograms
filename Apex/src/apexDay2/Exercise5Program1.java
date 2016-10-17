/* Program 1: 
Write a program which calculate the Discount(5%) price for an Item. 
Note: take the item price from user and find 5% discount. 

	Hint: Use Scanner class and nextDouble() method
*/

package apexDay2;
import java.util.Scanner;
public class Exercise5Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter item price: ");
		itemPrice = sc.nextDouble();
		double discount = itemPrice*0.05;
		System.out.println("5 % Discount amount is :" + discount);
		System.out.println("Item price after discount = " + (itemPrice-discount));
	}

}
