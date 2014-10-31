/**
 * @file TestThread.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/7/2014
 */

package com.valerysamovich.java.advanced.multithreading;

public class TestThread {

	public static void main(String[] args) {
		
		// Thread Object(s)
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
	}

}
