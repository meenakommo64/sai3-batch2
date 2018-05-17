package com.sageit.exceptions;

import java.io.IOException;

public class WebsiteUtility {

	public WebsiteUtility() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		CustomerService cs = new CustomerService();

		cs.submitOrder(10, "laptop","gift","dallas");
		
		Order order = new Order();
		
		order.setQuanity(Integer.parseInt(args[0]));
		order.setItem(args[1]);
		order.setComments(args[2]);
		order.setAddress(args[3]);

		Integer orderId = cs.submitOrder(order);

		System.out.println("Order id ...." + orderId);

		cs.retrieveOrder(10);

		try {
			cs.cancelOrder(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
