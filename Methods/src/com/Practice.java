package com;

public class Practice {
	public static void main(String[] args) {
		//display();
//		Practice obj = new Practice();
//		System.out.println(obj.add(2, 3));
		int a =10;
		change(a);
		System.out.println(a);
		
	}
	public static void change(int a) {
		a=20;
	}
	
	
	public void display() {
		System.out.println("Java Methods");
	}
	public int add(int a ,int b) {
		return a+b;
	}

}
