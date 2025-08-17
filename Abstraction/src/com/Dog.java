package com;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Dog Baarking..");
	}

	@Override
	public int noOfLegs() {
		return 4;
	}

}
