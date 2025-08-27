package com.interfaces;

@FunctionalInterface
public interface FunctionalInterfaces {
	
	public void hi();
	//Fun-Int should have one method only.
	//public void sayBye();
	
	default void sayHi() {
		System.out.println("FunctionalInterface: Hi ");
	}
	static void staticMethod() {
		System.out.println("FunctionalInterface: Static Method ");
	}

}
//public void sayBye();
	//if you implement parent interface there should not be method in in child interface.
	
