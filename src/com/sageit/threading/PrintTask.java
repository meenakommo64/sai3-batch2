package com.sageit.threading;

public class PrintTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Print task completed.");		
	}

}
