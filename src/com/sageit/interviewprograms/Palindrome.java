package com.sageit.interviewprograms;

public class Palindrome {

	String s="madam";
	char[] a = s.toCharArray();

	public void checkPalindrome() {
		for (int i = 0; i <= a.length - 1; i--) {

			for (int j = 0; j <= a.length / 2; j++) {
				if (a[i] == a[j]) {

					System.out.println("is palindrome");

				} else {
					System.out.println("not plaindrome");
				}
			}

		}

	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		
		p.checkPalindrome();

	}

}
