package com;

public class FuelCar implements Car,Vehicle{

	@Override
	public void start() {
		System.out.println("Vehicle is started");
	}

	@Override
	public void carName() {
		System.out.println("Car..");
	}

}
