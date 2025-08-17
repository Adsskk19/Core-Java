package com.interfaces;

public class Test {
	public static void main(String[] args) {
		
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		airtel.messaging();
		airtel.recharge();
		
		Jio jio = new Jio();
		jio.calling();
		jio.data();
		jio.messaging();
		jio.recharge();
		
	}
}
