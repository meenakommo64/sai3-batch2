package com.sageit.finalkeyword;

public class Company {

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public final String companyName = "active.com";

	public final Integer numberOfEmployees(String department) {

		if (department.equals("Sales")) {
			return 10;
		} else if (department.equalsIgnoreCase("accounting")) {
			return 5;
		} else {
			return 20;
		}
		
	}

}
