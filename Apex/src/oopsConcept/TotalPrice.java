package oopsConcept;

import java.util.*;

public class TotalPrice {

	Item item = new Item();

	public double TotalPrice() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter Item Number: ");
		int itemNumber = sc.nextInt();
		item.setItemNumber(itemNumber);

		System.out.println("Enter Item Name: ");
		String itemName = sc.nextLine();
		sc.nextLine();
		item.setItemName(itemName);

		System.out.println("Enter item Quantity: ");
		int itemQuantity = sc.nextInt();
		sc.nextLine();
		item.setItemQuantity(itemQuantity);

		System.out.println("Enter the Price: ");
		double itemPrice = sc.nextDouble();
		item.setItemPrice(itemPrice);
		sc.close();
		double totalPrice = (item.getItemPrice() * item.getItemQuantity());
		return totalPrice;
	}

	public void Display() {

		System.out.println("Total Price is : " + TotalPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalPrice calculation = new TotalPrice();
		calculation.Display();

	}

}
