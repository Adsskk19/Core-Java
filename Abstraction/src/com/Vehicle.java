package com;

public interface Vehicle {

	int age = 24;// Not default access modifier
//here also Public JVM assign automatically.
	int price = 11000;// public static final by default

	public void start();

}
