package com.sageit.utility;

import java.util.Scanner;

import com.sageit.finalkeyword.Company;

public class FinalTest {

	public FinalTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String arg[]) {
		
		Company c = new Company();
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();

		int a = Integer.parseInt(s);
		
		Integer integer = new Integer(a);

		Integer integer1 = Integer.parseInt("abc");
		
		Integer number = c.numberOfEmployees(s.toString());
	
		System.out.println("Number of employees.."+number);
		
	}
	

}
