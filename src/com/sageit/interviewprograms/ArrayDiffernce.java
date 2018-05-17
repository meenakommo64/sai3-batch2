package com.sageit.interviewprograms;

public class ArrayDiffernce {

	int[] number = { 10, 25, 8, 4, 6 };
	int small =6;
	int highest = 10;
	int diff;
	

	public void difference() {

		for (int i = 0; i <= number.length; i++) {
			if (number[i] > highest) {
				highest = number[i];
			} else {
				if (number[i] < small) {
					small = number[i];
				}
			}
		}
		
		 diff = highest-small;
		
	}

	public static void main(String[] args) {
		ArrayDiffernce a = new ArrayDiffernce();
		System.out.println("the difference is" + a.diff);

}
}
