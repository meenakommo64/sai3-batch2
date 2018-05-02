package com.sageit.utility;

import com.sageit.interfaces.OrderService;
import com.sageit.interfaces.OrderServiceImpl;
import com.sageit.interfaces.OrderServiceImpl1;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public String checkPalindrome(String input) {

		char[] inputArr = input.toCharArray();

		char[] nonWSInputArr = new char[inputArr.length];

		int count = 0;

		for (char ch : inputArr) {
			if (!Character.isWhitespace(ch)) {
				nonWSInputArr[count] = ch;
				count++;
			}
		}

		int length = nonWSInputArr.length;

		for (int i = 0, j = (length - 1); i < (length / 2 + 1); i++, j--) {

			if (nonWSInputArr[i] != nonWSInputArr[j]) {
				return "false";
			}

		}

		return "true";

	}

	public static void main(String args[]) {

		Test t = new Test();
		System.out.println("result.." + t.checkPalindrome("madam"));

	}

	public static OrderService getOrderService(String productName) {

		OrderService os = null;

		if (productName.equals("laptop")) {
			os = new OrderServiceImpl();
		} else {
			os = new OrderServiceImpl1();
		}

		return os;
	}

}
