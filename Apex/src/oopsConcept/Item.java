package oopsConcept;

public class Item {
	private int itemNumber;
	private String itemName;
	private int itemQuantity;
	private double itemPrice;
	
	//setters 
	public void setItemNumber(int ItemNumber){
	itemNumber = ItemNumber;
	}
	
	public void setItemName(String ItemName){
		itemName = ItemName;
	}
	
	public void setItemQuantity(int ItemQuantity){
		itemQuantity = ItemQuantity;
	}
	
	public void setItemPrice(double ItemPrice){
		itemPrice = ItemPrice;
	}
	
	//Getters
	public int getItemNumber(){
		return itemNumber;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public int getItemQuantity(){
		return itemQuantity;
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
	
}