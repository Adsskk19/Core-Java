package com.quiz;

public class Main {
	
	public static void main(String[] args) {
		Demo obj = null;
		//Obj.show();
		Data d1 = new Data();
		Data d2 = d1;
		d2.value=50;
		System.out.println(d1.value);
		
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = new Example();
		System.out.println(Example.count);
		
		Example obj3 = new Example();
		
		System.out.println(obj3);
		
		
	}
}
class Demo {
	void show() {
		System.out.println("Hello");
	}
}
class Data{
	int value =30;
}
class Example{
	static int count =0;
	Example(){
		count++;
	}
	
	
	public String toString() {
		return "Custom OBj REpre";
		
	}
}


