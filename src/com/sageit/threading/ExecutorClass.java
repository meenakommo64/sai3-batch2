package com.sageit.threading;

public class ExecutorClass {

	public void printSomething() {
		System.out.println("Hello....");
	}

	public static void main(String args[]) throws InterruptedException {
		
		ExecutorClass mc = new ExecutorClass();
		
		Thread t1 = new Thread(new StringSplitterTask());

		t1.start();
		
		//Thread.sleep(1000);
		
		//t1.join(1);
		
		Thread t2 = new Thread(new PrintTask());
		
		t2.start();
		
		//t2.join();
		
		Thread.yield();

		mc.printSomething();

	}
}
