package com.sageit.castingobjects;

public class Utiltiy {

	public Utiltiy() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		
		Customer customer = new Customer();
		
		Order order = customer.placeOrder("perfume", 10, false);
		
		System.out.println("item name from Order..."+order.itemName);
		
	}

}
