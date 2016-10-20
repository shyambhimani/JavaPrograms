package oopsConcept;

public class Item {
	private int itemNumber;
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	public Item(){
		
	}
	
	public void setItemNumber(int ItemNumber){
		itemNumber = ItemNumber;
	}
	
	public int getItemNumber(){
		return itemNumber;
	}
	
	public void setItemName(String ItemName){
		itemName = ItemName;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public void setItemPrice(double ItemPrice){
		itemPrice = ItemPrice;
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
	
	public void setItemQuantity(int ItemQuantity){
		ItemQuantity = itemQuantity;
	}
	
	public int getItemQuantity(){
		return itemQuantity;
	}

}
