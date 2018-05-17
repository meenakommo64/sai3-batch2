package com.sageit.inputoutput;

import java.io.Serializable;

public class Order implements Serializable{

	public Order() {
		// TODO Auto-generated constructor stub
	}

	transient private Integer id;
	private String itemName;
	private Integer quantity;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
