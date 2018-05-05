package com.sageit.utility;

import com.sageit.scopes.Employee;

public class EqualsTest {

	public EqualsTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[]) {

		Employee e = new Employee();
		e.id = 100;
		e.salary = 12000;

		Employee e1 = new Employee();
		e1.salary = 12000;
		
		System.out.println("are the two objects equal..." + e.equals(e1));
		
		System.out.println("hashcode e..."+e.hashCode());
		
		System.out.println("hashcode e..."+e1.hashCode());
		
	}
}
