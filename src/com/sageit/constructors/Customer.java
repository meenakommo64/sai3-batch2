package com.sageit.constructors;

import java.lang.System;

public class Customer {

	int a;
	String name;
	String email;
	String address;
	int income;

	private Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String email) {
		this.email = email;
	}
	
	public Customer(String email, String address, String name, String income) {
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public boolean placeOrder(String item, int quanity) {
		
		//TODO
		
		return false;
	}
	
	public static void main(String[] agrs) {

		int a = 10;
		int b = 1000;

		int c = a + b;

		System.out.println("Sum result.." + c);

	}

	public static Customer getInstance() {
		
		Customer f = new Customer();
		
		return f;
		
	}
	
}
