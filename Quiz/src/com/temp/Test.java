package com.temp;

public class Test {
	
	public static void main(String[] args) {
		//new C(100);
		new Outer().new Inner().display();
	}

}

class A{
	A(){
		System.out.println("A const");
	}
	A(int x){
		this();
		System.out.println("A param const"+ x);
	}
}
class B extends A{
	B(){
		super(50);
		System.out.println("B const");
	}
	B(int x){
		this();
		System.out.println("B param const"+ x);
	}
}
class C extends B{
	C(int x){
		super(x);
		System.out.println("C const");
	}
}
class Outer{
	int x =100;
	
	class Inner{
		int x =200;
		void display() {
			int x =300;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);

		
		}
	}
}








