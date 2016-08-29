/**
 * 
 */
package com.test.threads;

import java.awt.List;
import java.util.ArrayList;

/**
 * @author pradeep
 *
 */
public class HelloWorldRunnable implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Test Run");
		java.util.List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Y");

		for (String string : list) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(string);
		}

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		HelloWorldRunnable runnable1 = new HelloWorldRunnable();
		HelloWorldRunnable runnable2 = new HelloWorldRunnable();
		HelloWorldRunnable runnable3 = new HelloWorldRunnable();
		Thread thread = new Thread(runnable1);
		thread.start();
		thread.join();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		Thread thread3 = new Thread(runnable3);
		thread3.start();
	}

}
