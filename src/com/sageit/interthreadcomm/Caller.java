package com.sageit.interthreadcomm;

public class Caller {

	public static void main(String args[]) {

		
		//This is for producer consumer problem
		Resource pc = new Resource();
		
		ConsumerThread t1 = new ConsumerThread(pc);

		t1.start();

		ProducerThread t2 = new ProducerThread(pc);

		t2.start();
		
		
	}

}
