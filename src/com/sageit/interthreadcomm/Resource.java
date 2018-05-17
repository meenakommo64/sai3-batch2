package com.sageit.interthreadcomm;

public class Resource {

	String resourceValue = null;

	public void consume(String s) throws InterruptedException {

		synchronized (this) {

			if (resourceValue == null) {
				wait();
			}
			// This method will have logic to store data to database
			System.out.println("I consumed it..."+resourceValue);
		}

	}

	public void produce() {

		// Get data from database and create a string out of it and return it

		synchronized (this) {
			resourceValue = "I produced this message";

			notify();
		}

	}

}
