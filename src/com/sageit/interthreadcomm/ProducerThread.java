package com.sageit.interthreadcomm;

public class ProducerThread extends Thread {

	Resource pc;
	
	public ProducerThread(Resource pc){
		this.pc = pc;
	}
	
	public void run() {

		try {
			pc.consume("abcd");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Consuume operation is done..." + pc.resourceValue);

	}

}
