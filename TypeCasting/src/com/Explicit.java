package com;

public class Explicit {
	public static void main(String[] args) {
		short s =65;
		
		byte b = (byte)s;
		
		char c = (char)s;
		
		float num ='|';
		
		int i = (int)13.456f;
		
		System.out.println("Short.."+s);	
		System.out.println("Byte.."+b);
		System.out.println("char.."+c);
		System.out.println("Float.."+num);
		System.out.println("Int.."+i);


	}

}
