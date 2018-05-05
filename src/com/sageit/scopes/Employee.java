package com.sageit.scopes;

public class Employee {

	public Integer id = 10;
	public String name = "Hari";
	public Integer salary = 0;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void fullfillOrder(Integer orderId, String name) {

		System.out.println("name is ..." + name);

	}

	public void main1(String arg[]) {
		fullfillOrder(100, "Hari k");
	}

	@Override
	public int hashCode() {

		int hashcode = 11;

		return hashcode + salary.hashCode();

	}

	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}

		if (!(o instanceof Employee)) {
			return false;
		}

		if (!salary.equals(((Employee) o).salary)) {
			return false;
		}

		return true;
	}

}
