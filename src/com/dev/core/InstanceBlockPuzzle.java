package com.dev.core;

public class InstanceBlockPuzzle {
	{
		System.out.println("Instance block 1");
	}

	public InstanceBlockPuzzle() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance block 2");
	}

	public static void main(String[] args) {
		new InstanceBlockPuzzle();
	}

}
