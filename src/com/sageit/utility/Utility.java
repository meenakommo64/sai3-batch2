package com.sageit.utility;

import com.sageit.inheritance.Analyst;
import com.sageit.inheritance.Employee;
import com.sageit.interfaces.OrderService;
import com.sageit.interfaces.OrderServiceImpl;


/*
 * This main method is the central test class of our Day2 project..
 * 
 */
public class Utility {

	public Utility() {
		// TODO Auto-generated constructor stub
	}

	//This is main method
	public static void main(String args[]) {

		Employee e = new Analyst();		
		
		Object o = new Analyst();
		
		//dynamic binding
		OrderService orderService = Test.getOrderService("laptop");
		
		orderService.submitOrder("Laptop", 1);
		
		//static binding
		OrderServiceImpl osimpl = new OrderServiceImpl();
		
		osimpl.submitOrder("", 1);
		
		String s = "star.com";
		
	}

}
