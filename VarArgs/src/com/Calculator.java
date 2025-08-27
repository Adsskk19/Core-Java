package com;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal  = new Calculator();
		cal.sum(23, 23);
		cal.sum(23, 34,45);
		cal.sum(10,20,30,40);
	}
	
//	public void sum(int a , int b) {
//		System.out.println(a+b);
//	}
//	public void sum(int a , int b,int c) {
//		System.out.println(a+b+c);
//	}
	//variable arguments
	//These can accept any num of inputs.
	//of same datatypes acts as a list
	public void sum(int...nums) {
		int sum=0;
		for(int a:nums) {
			//System.out.println(a);
			sum+=a;
		}
		System.out.println(sum);
	}
	
	
}
