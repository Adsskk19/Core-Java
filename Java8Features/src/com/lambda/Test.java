package com.lambda;

public class Test {

	public static void main(String[] args) {
		
		
		Vehicle bike = new Bike();
		bike.start();
		
		Vehicle lorry = new Vehicle() {

			@Override
			public void start() {
				System.out.println("Started Lorry");
			}
			
		};
		lorry.start();

		Vehicle car = ()->{
			for(int i =0;i<=5;i++) {
				System.out.println(i);
			}
			System.out.println("Started Car");
			System.out.println("Going to Airport..");
		};
		car.start();
	
		Calculator calc = ( a , b)->{return a+b;};
	
		int res = calc.add(10, 30);
		System.out.println(res);
		
		
	}
	
}
