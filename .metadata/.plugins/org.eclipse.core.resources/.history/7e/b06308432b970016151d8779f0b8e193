package oopsConcept;

import java.util.*;

public class TotalPurchase extends Item {

	Item item1 = new Item();

	Scanner sc = new Scanner(System.in);

	public void TotalQuantity() {

		System.out.println("Please enter Item Number: ");
		int itemNumber = sc.nextInt();
		item1.setItemNumber(itemNumber);

		System.out.println("Please enter Item name: ");
		String itemName = sc.nextLine();
		item1.setItemName(itemName);

		System.out.println("Please enter Quantity: ");
		int itemQuantity = sc.nextInt();
		item1.setItemQuantity(itemQuantity);

		System.out.println("You have bought " + item1.getItemName() + " " + item1.getItemQuantity());

		sc.close();
	}

//	public void TotalPrice() {
//		
//		System.out.println("Total price is: " + item1.getItemPrice() * item1.getItemQuantity());
//
//	}

	public static void main(String[] args) {

		TotalPurchase totalpurchase1 = new TotalPurchase();
		totalpurchase1.TotalQuantity();
		

	}

}
