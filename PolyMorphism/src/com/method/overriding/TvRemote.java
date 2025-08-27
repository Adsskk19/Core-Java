package com.method.overriding;

public class TvRemote extends Remote{
	
	@Override
	void turnOn(){
		//super.turnOn();// we called parent class method.
		System.out.println("Tv turned On..");	
	}
}
