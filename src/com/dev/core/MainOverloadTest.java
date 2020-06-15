package com.dev.core;

public class MainOverloadTest {

	public static void main() {
		System.out.println("main 1");
	}

	public static void main(int a) {
		System.out.println("main 2");
	}

	public static void main(String s) {
		System.out.println("main 3");
	}

	public static void main(String[] args) {
		System.out.println("main 4");
		MainOverloadTest.main(4);
	}

}
