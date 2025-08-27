package com.method.overriding;

public class Test {
	public static void main(String[] args) {
		
		Remote remote = new Remote();
		TvRemote tv = new TvRemote();
		
		
		tv.turnOn();
	}
}
