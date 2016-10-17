package apexDay2;
import java.util.*;
public class Exercise5Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cookie, cake;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of cookies you bought: ");
		cookie = sc.nextInt();
		System.out.println("Enter number of cake you bought: ");
		cake = sc.nextInt();
		
		double priceOfCookie = 0.05;
		double priceOfCake = 0.03;
		
		double totalAmount = cookie*priceOfCookie + cake*priceOfCake;
		if (totalAmount >= 10){
			double discount = totalAmount * 0.05;
			System.out.println("You will get 5% discount, your Discount amount is: " + discount);
			System.out.println("Your total amount after discount is : " + (totalAmount - discount));
		}
		

	}

}
