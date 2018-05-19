package com.sageit.collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OrderProcessingService {

	Map<Order, String> orderAddressMap = null;

	public OrderProcessingService() {
	}

	public void processOrders(List<Order> orders) {

		OrderDAO orderDAO = new OrderDAO();

		this.orderAddressMap = orderDAO.getOrdersForToday();

	}

	public boolean rejectOrder() {

		for (Entry entry : orderAddressMap.entrySet()) {

			if (entry.getValue().equals("Alaska")) {
				
				orderAddressMap.remove(entry.getKey());
			
			}
		}

		return true;
		
	}

}
