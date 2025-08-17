package com.interfaces;

public class Jio implements Trai {

	@Override
	public void calling() {
		System.out.println("Unlimited");
	}

	@Override
	public void data() {
		System.out.println("4G data");
	}

	@Override
	public void messaging() {
		System.out.println("1000 SMS per day");
	}

	@Override
	public void recharge() {
		System.out.println("150 Per Month");
	}
	
}
