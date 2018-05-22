package com.sageit.cloning;

public class Employee implements Cloneable {

	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	protected Object clone() {

		Employee employee = null;

		try {
			employee = (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;

	}

}
