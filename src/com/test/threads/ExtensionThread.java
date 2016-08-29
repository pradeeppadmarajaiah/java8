package com.test.threads;

public class ExtensionThread extends Thread {

	@Override
	public void run() {
		System.out.println("hello World");
	}

	public static void main(String[] args) {
		ExtensionThread thread = new ExtensionThread();
		thread.start();
	}

}
