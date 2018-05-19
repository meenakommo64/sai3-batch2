package com.sageit.collections;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {

	public OrderComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Order o1, Order o2) {

		if (o1.getOrderId() > o2.getOrderId()) {
			return 1;
		} else if (o1.getOrderId() < o2.getOrderId()) {
			return -1;
		}

		return 0;
	}

}
