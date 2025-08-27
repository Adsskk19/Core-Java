package com;

public class Final {
	
	//final, finally , finalise
	
	//final
	//static we can change not constant
	//but we cant do bcz it changes entire instances.
	
	int a =10;
	final int b =15;//Fixed you can't change
	final String dbPassword = "hakdj#$*HD45";
	public static void main(String[] args) {
		Final obj = new Final();
		System.out.println(obj.a);
		obj.a=20;
		System.out.println(obj.a);
		System.out.println(obj.b);
		//obj.b=20;
		
		
	}
	final void hi() {
		System.out.println("Hiiii");
	}
	
	//
	final void hi(String name) {
		System.out.println("Hiii.."+name);
	}
	
	
	

}
