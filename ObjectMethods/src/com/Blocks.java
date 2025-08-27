package com;

public class Blocks {
	//public static final a=10.0;
	static int a;
	int b;
	public Blocks() {
		System.out.println("From Constructor..");
	}
	public static void main(String[] args) {
		System.out.println("From Main Method");
		a=10;
		Blocks b = new Blocks();
	}
	static {
		System.out.println("From static block");
	}
	static {
		System.out.println("Static block 2");
	}
	{
		System.out.println("From instance Block");
		a=20;
		b=2;
	}
	

}
