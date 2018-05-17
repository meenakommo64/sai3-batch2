package com.sageit.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable{

	private int count = 0;
	
	public synchronized void incrementCount() {
	
		Lock lock = new ReentrantLock();
		
		lock.lock();
		
		count++;
		System.out.println("count value is..."+count);
	
		lock.unlock();
	}

	@Override
	public void run() {
		incrementCount();
	}


}
