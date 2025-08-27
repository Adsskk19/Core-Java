package com.inner;

public class Test {
	
	public static void main(String[] args) {
		 
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
		Vehicle lorry = new Vehicle() {
			
			@Override
			public void start() {
				System.out.println("Started Lorry");
			}

			@Override
			public void stop() {
				System.out.println("Stopped Lorry");	
			}
			
			@Override
			public void drive() {
				System.out.println("Lorry driving");		
			}
			
//			public void change() {
//				System.out.println("Changed");
//			}
			
			
		};
		lorry.start();
		lorry.stop();
		lorry.drive();
		//lorry.change();
	}

}
