 package com;

public class Test {
	public static void main(String[] args) {
		//Lion lion = new Lion();
		Cub cb = new Cub();
		cb.sound();
		cb.sleeping(); 
	
		Dog dog = new Dog();
		dog.sound();
		dog.sleeping();
		
		//Animal animal = new Animal();
		//animal.sound /No use /No sound /only with child class
		
		Car car = new Car();
		car.start();
		System.out.println(Vehicle.price);
		
		}

}
