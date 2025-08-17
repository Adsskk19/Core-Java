package com.interfaces;

public class Airtel implements Trai{

	@Override
	public void calling() {
		System.out.println("Call at 1p/1s");
	}

	@Override
	public void data() {
		System.out.println("2G");
	}

	@Override
	public void messaging() {
		System.out.println("100 SMS per day");
	}

	@Override
	public void recharge() {
		System.out.println("1 GB at 100rs");
	}

}
