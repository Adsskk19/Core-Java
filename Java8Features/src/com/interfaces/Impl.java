package com.interfaces;

public class Impl implements Interface2,FunctionalInterfaces{

	@Override
	public void sayBye() {
		System.out.println("Byee..");
	}

	
	
	@Override
	public void defaultMethod() {
		System.out.println("From child: overided default method");
	}

	@Override
	public void hi() {
		
	}



	@Override
	public void sayHi() {
		//System.out.println("My child say hi");
		Interface2.super.sayHi();
		FunctionalInterfaces.super.sayHi();
	}

}
