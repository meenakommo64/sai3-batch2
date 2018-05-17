package com.sageit.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class OrderService {

	public OrderService() {
		// TODO Auto-generated constructor stub
	}

	public static String fullFillOrder(Order order) {

		// TODO
		// to send email to a person and let him pack things and create a invocie to
		// send to Fedex

		try {
			OutputStream os = new FileOutputStream("C:\\Users\\sairam\\Desktop\\Course\\order.ser");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(order);
			
			oos.close();
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "fulfilled";

	}
	
	public static void main(String args[]) throws ClassNotFoundException, IOException {
		
		Order order = new Order();
		order.setId(100);
		order.setItemName("phone");
		order.setQuantity(10);
		
		fullFillOrder(order);
		checkOrder();
	}

	public static void checkOrder() throws ClassNotFoundException, IOException {
		
		InputStream is = new FileInputStream("C:\\Users\\sairam\\Desktop\\Course\\order.ser");
		
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Order order = (Order)ois.readObject();
		
		System.out.println("The values in object are ..."+order.getId()+order.getItemName()+order.getQuantity());
		
	}

}
