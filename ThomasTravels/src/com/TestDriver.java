package com;

public class TestDriver {

	public static void main(String[] args) {
		TestDriver test = new TestDriver();
		Driver driver[] = new Driver[5];	
		driver[0] = new Driver(1,"Car","Manikanta",1500.34);
		driver[1] = new Driver(2,"lorry","Akash",3500.64);
		driver[2] = new Driver(3,"Car","Sudhagar",4200);
		driver[3] = new Driver(4,"Auto","Balaji",2400.3);
		driver[4] = new Driver(5,"Car","Kiran",1900);
		
		System.out.println(driver[0]);
		
		
		
	}

}
