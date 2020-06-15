package com.dev.core;

public class EntryPoint {
	
	static {
		System.out.println("In static block");
		EntryPoint.test();
	}
	
	static void test() {
		System.out.println("Test method");
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
	}

}
