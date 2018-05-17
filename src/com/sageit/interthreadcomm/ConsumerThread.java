package com.sageit.interthreadcomm;

public class ConsumerThread extends Thread {

	Resource pc;
	
	public ConsumerThread(Resource pc){
		this.pc = pc;
	}

	public void run() {
		
		pc.produce();

		System.out.println("Produce operation is done..." + pc.resourceValue);

	}

}
