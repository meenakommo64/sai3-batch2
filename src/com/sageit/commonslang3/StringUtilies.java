package com.sageit.commonslang3;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

public class StringUtilies {

	public StringUtilies() {
		// TODO Auto-generated constructor stub
	}

	public static void capitalizeString(String string) {
		
		String capitalizedString = StringUtils.capitalize(string);
		
		System.out.println("Result..."+capitalizedString);
		
	}
	
	public static void main(String args[]) {
		
		capitalizeString("how are you");
		
		Random r = new Random();
		
		int i = 2147483647;
		
		Double d = Math.pow(2, 32);
		
		Date currentDate = new Date(System.currentTimeMillis());

		SimpleDateFormat df = new SimpleDateFormat();
		
		df.applyPattern("dd/MM/YY");
		
		System.out.println("number is ..."+df.format(currentDate));
		
		String[] arr = "hello hw, are you, ..".split(",");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer("hello hw, are you, ..", ",");
		
		while(st.hasMoreTokens()) {
			System.out.println("token is ..."+st.nextToken());
		}
		
		
	}
	
	

	
	
	
}
