package com;

public class Test {
	//int num =2234;
		public static void main(String[] args) {
			
			Company.companyName ="ABCtechnologies";
			
			Company myCompany = new Company();
			
			//myCompany.companyName="ABCtechnologies";
			myCompany.location ="Bangalore";
			myCompany.numOfEmployees=1200;
			
			System.out.println(myCompany.companyName);
			System.out.println(myCompany.location);
			System.out.println(myCompany.numOfEmployees);
			
			Company friendCompany = new Company();
			
			//friendCompany.companyName="ABCtechnologies";
			friendCompany.location="Hyd";
			friendCompany.numOfEmployees=900;
			
			System.out.println(friendCompany.companyName);
			System.out.println(friendCompany.location);
			System.out.println(friendCompany.numOfEmployees);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			Bike myBike = new Bike();//object1
			Bike tempBike = new Bike("Blue");
			System.out.println(tempBike.color);
			//System.out.println(num);
			
			myBike.bikeModel="Bullet";
			
			myBike.color="Commando Sand";
			
			myBike.speed=0;
			
			myBike.gear=0;
			
			myBike.petrolCapacity=17;
			
			System.out.println(myBike.bikeModel);

			System.out.println(myBike.color);

			System.out.println(myBike.speed);
			System.out.println(myBike.gear);
			System.out.println(myBike.petrolCapacity);
			
			myBike.increaseGear();
			System.out.println("My Bike gear: "+ myBike.gear);
			myBike.accelerate();
			System.out.println("My Bike Speed: "+myBike.speed);
			myBike.increaseGear();
			System.out.println("My Bike gear: "+ myBike.gear);
			myBike.accelerate();
			System.out.println("My Bike Speed: "+myBike.speed);
			myBike.applyBrake();
			System.out.println("My Bike gear: "+myBike.gear);
			System.out.println("My Bike Speed: "+myBike.speed);

			Bike friendBike = new Bike();//object2
			
			friendBike.bikeModel="pulsar";
			friendBike.color="Black";
			friendBike.gear=3;
			friendBike.petrolCapacity=12;
			friendBike.speed=20;
			
			System.out.println("Friend Bike color: "+friendBike.color);
			friendBike.increaseGear();
			System.out.println("Friend Bike gear: "+ friendBike.gear);
			friendBike.accelerate();
			System.out.println("Friend Bike Speed: "+ friendBike.speed);
            friendBike.applyBrake();
			System.out.println("Friend Bike Speed: "+ friendBike.gear);
			System.out.println("Friend Bike Speed: "+ friendBike.speed);

			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
