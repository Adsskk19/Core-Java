package com;

public abstract class  Lion extends Animal{

	@Override
	public void sound() {
		System.out.println("Lionn Rooarr...");
		
	}
	
	/*
	 * public void sleeping() { System.out.println("Lion is sleeping.."); }
	 */

	@Override
	public int noOfLegs() {
		return 4;
	}

	

}
