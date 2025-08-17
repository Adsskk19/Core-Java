package com;

public class Class1 {
	public int a =10;
	private int b =20;
	protected int c =30;
	int d =45;
	public void hi() {
		System.out.println("Hiiii...");
	}
	//accessible in class level only
	private void bye() {
		System.out.println("Byee...");
	}
	public Class1() {
		
	}
	
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println(obj.a);
	}
}
//Jvm will not be able to load private class
//It will not find class