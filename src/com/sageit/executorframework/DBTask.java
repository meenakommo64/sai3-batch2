package com.sageit.executorframework;

import java.util.concurrent.Callable;

public class DBTask<Object> implements Callable<Object> {

	@Override
	public Object call() {
		// Create a connection to DB, select some some from a table and insert
		// some data into table

		System.out.println("DB task...");
		return null;

	}

}
