package com.references;


public class Main {
	public static void main(String[] args) {
		//new Dog().action();
		//new Z();
		//new Sample().cal();
		new Test().obj.show();
	}

}
class A{
	void show() {
		System.out.println("Class A");
	}
}
class Test{
	A obj = new A() {
		void show() {
			System.out.println("Anony Inner Class");
			super.show();
		}
	};
}


class Animal{
	void speak() {
		System.out.println("Animal Speaks");
	}
}
class Dog extends Animal{
	void speak() {
		super.speak();
		System.out.println("Dog Barks");
	}
	void action() {
		this.speak();
		super.speak();
	}
}

class X{
	X(){
		System.out.println("Class X ");
	}
}
class Y extends X{
	Y(){
		this(10);
		System.out.println("Class Y ");
	}
	Y(int a){
		super();
		System.out.println("Class Y Param ");
	}
}
class Z extends Y{
	Z(){
		super();
		System.out.println("Class Z ");
	}
	
}

class Sample{
	void display(Sample obj) {
		System.out.println("Method called");
	}
	void cal() {
		display(this);
	}
	
}





















