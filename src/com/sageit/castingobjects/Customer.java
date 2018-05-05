package com.sageit.castingobjects;

public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public SpecialOrder placeOrder(String itemName, Integer quantity, boolean isSpecial) {
		
		Order order = null;
		
		if(isSpecial) {
			order = new SpecialOrder();
			order.itemName = "special"+itemName;
		}else {
			order = new Order();
			order.itemName = itemName;
		}
		
		order.isSpecial = isSpecial;
		
		order.quantity = quantity;
		
		return (SpecialOrder)order;
		
	}
	
	
}
