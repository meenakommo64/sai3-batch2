package com.sageit.threading;

import java.util.ArrayList;
import java.util.List;

public class StringSplitterTask implements Runnable {

	@Override
	public void run() {

		String s = "abc,def,hari,suman,dharani,ajay,jyoti,khklkhlk,asdfasd,asdfasdfa,asdfasdfasd,asdfasdfasd,asdfasdfas,asdfasdfas,asdfasdfasdf,aasdfsa,afsdasfdas";

		String[] sarr = s.split(",");

		List l = new ArrayList();

		for (int i = 0; i < sarr.length; i++) {
			l.add(sarr[i]);
		}

		System.out.println("String splitter Task is completed");

	}

}
