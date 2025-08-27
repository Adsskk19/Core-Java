package com;

public class Calculator {
	public static void main(String[] args) {
		
		int sum = Calculator.sum();
		System.out.println(sum);
		sum = Calculator.sum(10,34);
		System.out.println(sum);
		Calculator.sum(1,2,56);
	}
	
	static int sum() {
		int a = 10+10;
		return a;
	}
    static int sum(int a , int b) {
		int c = a+b;
		return c;
	}
    static void sum(int a , int b,int c) {
    	int d = a+b+c;
    	System.out.println(d);
    }
	
}
