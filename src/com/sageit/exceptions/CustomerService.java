package com.sageit.exceptions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class CustomerService {

	public CustomerService() {
		// TODO Auto-generated constructor stub
	}

	public Integer submitOrder(Integer quanity, String item, String comments, String address) {

		return null;
	}

	public Integer submitOrder(Order order) {

		File f = new File("C:\\Work\\Files\\abc.txt");

		try (FileWriter fw = new FileWriter(f)) {
			fw.write("Quantity " + order.getQuanity());
			fw.write("Item " + order.getItem());
			fw.write("Comments " + order.getComments());
			fw.write("Address " + order.getAddress());
		} catch (IOException | NullPointerException e) {
			e.printStackTrace();
		} finally {

		}

		return 1;
	}

	public Integer retrieveOrder(Integer orderId) {

		File f = new File("C:\\Work\\Files\\abc.txt");
		FileReader fr;

		try {

			fr = new FileReader(f);

			char[] readChars = new char[1000];
			int index = 0;
			int ch;

			while ((ch = fr.read()) != -1) {
				readChars[index] = (char) ch;
				index++;
			}

			System.out.println("read string is ..." + new String(readChars));

			fr.close();

		} catch (IOException | NullPointerException e) {
			e.printStackTrace();
			System.out.println("Please ask the user to send approtiate data..");
		}

		return 1;
	}

	public boolean cancelOrder(Integer orderId) throws Exception {

		long startTime = System.nanoTime();

		Date d = new Date(System.currentTimeMillis());

		InputStream is = null;
		
		InputStream is1 = null;
		OutputStream os = null;

		try {

			is = new FileInputStream("C:\\Users\\sairam\\Desktop\\Course\\download.jpg");
			
			os = new FileOutputStream("C:\\Users\\sairam\\Desktop\\download.jpg");

			BufferedInputStream bis = new BufferedInputStream(is);
			
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			byte[] bArr = new byte[128];
			
			int b;

			while ((b = bis.read(bArr)) != -1) {
				bos.write(bArr);
			}

		} finally {
			is.close();
			os.close();
		}

		long endTime = System.nanoTime();

		System.out.println("time taken by this method is .," + (endTime - startTime));

		if (d.before(new Date("05/01/2018"))) {
			throw new Exception();
		} else {
			return true;
		}

	}

}
