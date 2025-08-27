package com;

public class Car extends Vehicle{
	String color = "Blue";
	public Car() {
		System.out.println("Car Object is created");
	}
	void drive() {
		System.out.println("My car is crusing...");
	}
}
