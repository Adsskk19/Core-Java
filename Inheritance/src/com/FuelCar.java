package com;

public class FuelCar extends Car{
	//vehicle+Car
	
	String color = "Red";
	int fuelCapacity = 40;
	
	 FuelCar() {
		
		this(20,"Maroon");
		//this("black");
		//super();
		//JVM automatically calls parent class by "super()"Keyword and creates Object.
		System.out.println("Fuel car Object...");
	}
	
	FuelCar(int fuel){
		this("Green");
		this.fuelCapacity = fuel; 
	}
	
	FuelCar(String color){
		this.color= color;
	}
	FuelCar(int fuel,String color){
		this.fuelCapacity=fuel;
		this.color=color;
	}
	
	
	
	
	
	
	
	void fuel() {
		//this is used to current class reference
		//In instance method accessing instance variable
		//we are using this keyword to get current instance variable.
		System.out.println("Filling Petrol...");
	}
	void print() {
		System.out.println(this.fuelCapacity);
		System.out.println(color);
		System.out.println(super.color);
		//you can avoid writing super 
		//JVM automatically uses super to call.
		//when the method only in parent class otherwise super is needed.
	}
	public static void main(String[] args) {
		
	}
}
