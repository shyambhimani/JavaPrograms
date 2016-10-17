/* Program 2:
Write a program which calculate the Discount(5%) price for an Item, where the discount applies to purchases over $10.00.
Note: take the item price from user 	and find 5% discount
. Hint: use if statement.
*/

package apexDay2;
import java.util.*;
public class Exercise5Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter item price: ");
		itemPrice = sc.nextDouble();
		if (itemPrice > 10){
			double discount = itemPrice*0.05;
			System.out.println("Discount amount is: " +  discount);

			System.out.println("Price of item after discount is: " + (itemPrice - discount));
			
		}
		System.out.println("Item price less tha $10 is not eligible for discount sorry :( ");
		
		

	}

}
