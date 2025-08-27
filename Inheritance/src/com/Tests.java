package com;

public class Tests {
	public static void main(String[] args) {
		
		Car car = new Car();
//		car.start();
//		car.drive();

		FuelCar fc = new FuelCar();
//		fc.start(); 
//		fc.drive();
//		fc.fuel();
//		
//		EVCar ec = new EVCar();
//		ec.start();
//		ec.drive();
//		ec.charge();
		
		fc.print();
		//color: Red is child class variable 
		//super.color Blue is parent class variable.
		
		
		
		
		
		
		
	}
	
	
	
	
	
	void test() {
		Parent p= new Parent();
		System.out.println(p.a);
		p.m1();
		
		Child ch = new Child();
		System.out.println(ch.b);
		ch.m2();
		 
		ch.m1();
		p.m1();
		System.out.println(ch.a);
		System.out.println(p.a);
	}
}
