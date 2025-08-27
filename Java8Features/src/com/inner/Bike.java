package com.inner;

public class Bike extends Vehicle{

	@Override
	public void start() {
		System.out.println("Started Bike");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopped Bike");
	}
	
}
