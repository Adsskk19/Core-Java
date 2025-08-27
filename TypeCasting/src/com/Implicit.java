package com;

public class Implicit {
	public static void main(String[] args) {
		byte b = 100;
		short s = b;
		s =12008;
		int i =s;
		long l =i;
		
		float f = 12.345f;
		double d =f;
		
//	can't	boolean bool = i; 
//		boolean boo = true;
//		 can't char a = boo;
//		
//		 char a =i;
		
		f =i;
		
		System.out.println("Byte " +b);
		System.out.println("Short " +s);
		System.out.println("Int " +i);
		System.out.println("Long " +l);
		System.out.println("Float " +f);
		System.out.println("Double " +d);
	}

}
