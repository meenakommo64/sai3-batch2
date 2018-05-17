package com.sageit.executorframework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

public class ExecutorExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService es = Executors.newFixedThreadPool(2);

		List<Callable<Object>> tasks = new ArrayList<Callable<Object>>();

		tasks.add(new DBTask<Object>());
		tasks.add(new DBTask<Object>());
		tasks.add(new DBTask<Object>());
		
		es.invokeAll(tasks);

		System.out.println("Main method execution is complete...");

	}

}
