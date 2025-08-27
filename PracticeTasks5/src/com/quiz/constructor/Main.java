package com.quiz.constructor;


public class Main {
	public static void main(String[] args) {
		Test obj = new Test();
		Example obj1 = new Example();
		Example obj2 = new Example();
		Student s1 = new Student("Kiran");
		System.out.println(s1.name);
		System.out.println("-----------");
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		Child c = new Child(5);
		
		System.out.println("-----------");
		A ob = new A();
		System.out.println(ob.x);
		
		Test1.createObject();
		
		//Sample sam = new Sample();
		
	}
	
	//you can use access modifiers for constructors.
	private Main() {
		
	}

} 
class Test {
	int x;
	
	Test(){
		this(10);
		System.out.println("Default Constructor");
	}
	Test(int a){
		x = a;
		System.out.println("parameterized Constructor:"+ x);
	}
}
class Demo{
	//static Demo() 
	{
		System.out.println("Constructor called");
	}
}
class Example{
	Example(){
		System.out.println("Default Constructor");
	}
}
class Student{
	String name;
	Student(String n){
		name = n;
	}
}
class Counter{
	int count;
	Counter(){
		count++;
		System.out.println("Count:"+ count);
	}
}
class Parent{
	Parent(){
		System.out.println("Parent Constructor ");
	}
}
class Child extends Parent{
	Child(int x){
		System.out.println("Child Constructor ");
	}
}
class Sample{
	private Sample() {};
	
//	Sample(){
//		System.out.println("Inside Constructor");
//	}
	void display() {
		//Sample();
	}
}

class A{
	final int x;
	
	A(){
		x =100;
	}
}
class Test1{
	private Test1() {
		System.out.println("Private Constructor");
	}
	static void createObject() {
		Test obj7 = new Test();
	}
}


















