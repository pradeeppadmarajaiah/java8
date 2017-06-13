package com.bitiknow.java8.interfaceJ8;

public class InterfaceTest implements Interface1, Interface2 {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void print(String input) {
	
	}



	public static void main(String[] args) {

		InterfaceTest interfaceTest = new InterfaceTest();
		interfaceTest.print1("Pradeep");
	}
}
