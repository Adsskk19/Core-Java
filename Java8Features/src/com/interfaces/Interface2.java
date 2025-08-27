package com.interfaces;


public interface Interface2 {

	public void sayBye();
	
	default void sayHi() {
		System.out.println("Interface 2 : Hiii");
	}
	
	default void defaultMethod() {
		System.out.println("From Interface2 default method ");
	}
	static void staticMethod() {
		System.out.println("From interface2: Static method");
	}
	
	
	
}
