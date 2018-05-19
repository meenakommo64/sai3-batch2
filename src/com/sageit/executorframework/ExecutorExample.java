package com.sageit.executorframework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

public class ExecutorExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService es = Executors.newFixedThreadPool(2);

		List<Callable<String>> tasks = new ArrayList<Callable<String>>();

		tasks.add(new DBTask<String>());
		tasks.add(new DBTask<String>());
		tasks.add(new DBTask<String>());
		
		List<Future<String>> futures = new ArrayList<Future<String>>();
		
		for(Callable<String> task : tasks) {
			
			Future<String> future = es.submit(task);
			
			futures.add(future);
		
		}
		
		Future<String> future  = futures.get(1);
		
		String result = future.get();
		
		System.out.println("Result from the second thread is..."+result);
		
		System.out.println("Main method execution is complete...");

	}

}
