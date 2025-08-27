package com;

public class Bike {
	
	//Fields or variables -> inside class so instance variables
	String color; //10
	String bikeModel;//10
	int gear;//4
	int speed;//4
	double petrolCapacity; //8
	
	//Constructor
	Bike(){
		System.out.println("default constructor is called...");
	}
	//used to assign values to instance variables
	Bike(String newColor){
		color = newColor;
	}
	
	
	//Functions or methods
	void increaseGear() {
		gear++;
	}
	void accelerate() {
		speed+=10;
	}
	void applyBrake() {
		gear--;
		speed-=10;
	}

}
