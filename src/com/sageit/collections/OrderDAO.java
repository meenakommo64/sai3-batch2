package com.sageit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class OrderDAO {

	public OrderDAO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		OrderDAO orderDAO = new OrderDAO();
		orderDAO.getOrdersForToday();
	}

	public Map<Order, String> getOrdersForToday() {

		// Create a connection DB, do a select query on the table, get the data and map
		// to the below objects

		Order order1 = new Order();
		order1.setItemName("Laptop");
		order1.setOrderId(1231);
		order1.setQuantity(1);
		order1.setAmount(1000);

		Order order2 = new Order();
		order2.setItemName("Phone");
		order2.setOrderId(1232);
		order2.setQuantity(1);
		order2.setAmount(995);

		Order order3 = new Order();
		order3.setItemName("watch");
		order3.setOrderId(1234);
		order3.setQuantity(1);
		order3.setAmount(100);

		Order order4 = new Order();
		order4.setItemName("tablet");
		order4.setOrderId(1236);
		order4.setQuantity(1);
		order4.setAmount(200);

		Order order5 = new Order();
		order5.setItemName("Laptop2");
		order5.setOrderId(1231);
		order5.setQuantity(1);
		order5.setAmount(1000);

		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order5);
		orders.add(order4);
		orders.add(order3);
		orders.add(order2);

		Set<Order> ordersSet = new HashSet<Order>();
		ordersSet.add(order1);
		ordersSet.add(order5);
		ordersSet.add(order4);
		ordersSet.add(order3);
		ordersSet.add(order2);

		Set<String> itemNamesSet = new HashSet<String>();
		itemNamesSet.add("String");
		itemNamesSet.add("string");
		itemNamesSet.add("String");

		Iterator<Order> itr = orders.iterator();

		while (itr.hasNext()) {
			Order order = itr.next();
			System.out.println("Order object is ..." + order.toString());
		}

		for (Order order : orders) {
			System.out.println("Order object is ..." + order.toString());
		}

		for (int i = 0; i < orders.size(); i++) {
			System.out.println("Order object is " + orders.get(i));
		}

		// Iterating Set and checking if duplicates are present..
		for (Order order : ordersSet) {
			if (order.getOrderId().equals(1231)) {
				System.out.println("Order object from SET is ..." + order.toString());
			}
		}

		Map<Integer, Order> map = new HashMap<Integer, Order>();

		map.put(order1.getOrderId(), order1);
		map.put(order2.getOrderId(), order2);
		map.put(order3.getOrderId(), order3);

		Set<Integer> keySet = map.keySet();

		for (Integer orderId : keySet) {
			Order order = map.get(orderId);
			System.out.println("Order object from SET is ..." + order.toString());
		}

		for (Order order : map.values()) {
			System.out.println("Order object is ..." + order.toString());
		}

		for (Entry entry : map.entrySet()) {
			entry.getKey();
			entry.getValue();
		}

		Map<Order, String> orderAddressMap = new HashMap<Order, String>();
		orderAddressMap.put(order1, "Dallas");
		orderAddressMap.put(order2, "CA");
		orderAddressMap.put(order3, "Phoenix");

		Collections.synchronizedMap(orderAddressMap);

		Collections.sort(orders, new OrderComparator());

		Set<Order> sortedOrders = new TreeSet<Order>();

		sortedOrders.add(order5);
		sortedOrders.add(order2);
		sortedOrders.add(order1);
		sortedOrders.add(order3);
		sortedOrders.add(order4);

		Iterator<Order> itr1 = sortedOrders.iterator();

		while (itr1.hasNext()) {
			Order order = itr1.next();
			System.out.println("after sorting Order object is ..." + order.toString());
		}

		return null;

	}

}
