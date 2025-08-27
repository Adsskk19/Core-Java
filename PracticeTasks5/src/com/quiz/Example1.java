package com.quiz;

public class Example1 {
	int a =10;
	static int b =20;
	
	public static void main(String[] args) {
		
		Example1 obj1 = new Example1();
		Example1 obj2 = new Example1();
		obj1.a = 30;
		obj2.b = 40;
		System.out.println(obj1.a+" "+obj1.b);
		
	ObjectReference ref1 = new 	ObjectReference();
		ref1.setNum(10);
	
	ObjectReference ref2 = new 	ObjectReference();
	    ref2.setNum(20);
		
		System.out.println(ref1.num);
		
		
		Demo1 obj3 = new Demo1();
		Demo1 obj4 = new Demo1();
		
		System.out.println(obj3==obj4);
		System.out.println(obj3);
	}

}

class ObjectReference{
	int num;
	
	void setNum(int x) {
		num=x;
	}
}

class Demo1{
	int x =100;
}
