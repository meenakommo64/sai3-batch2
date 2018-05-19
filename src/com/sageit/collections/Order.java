package com.sageit.collections;

import java.io.Serializable;

public class Order implements Serializable, Comparable<Order> {

	public Order() {
		// TODO Auto-generated constructor stub
	}

	private Integer orderId;

	private String itemName;

	private Integer quantity;

	private Integer amount;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", quantity=" + quantity + ", amount=" + amount
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Order o) {

		if (orderId.compareTo(o.getOrderId()) > 0) {
			return 1;
		} else if ((orderId.compareTo(o.getOrderId()) < 0)) {
			return -1;
		}
		return 0;
	}

}
